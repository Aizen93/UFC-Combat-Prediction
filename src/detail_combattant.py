from bs4 import BeautifulSoup
import pandas as panda
import urllib.request
from urllib.error import HTTPError, URLError

import os
os.chdir('csv')

lien_combattant=panda.read_csv('liste_combattant.csv',encoding='utf-8')

#creation d'une dataFrame
combattant_df = panda.DataFrame(columns=['name', 'height', 'reach', 'age'])
cpt = 0
for i, row in lien_combattant.iterrows():
	combattant_dict={}
	dict_n={}
	try:
		with urllib.request.urlopen(row['link']) as sock:
			page = sock.read()
			page_soup = BeautifulSoup(page)
			h = page_soup.find_all('li')
			n = page_soup.find_all('span')
			erreur = 0
			li=[]
			li=n[0].get_text().split()
		
		try: 
			year = int(str(h[7].get_text().split()[-1]))
		except:
			year = 0
			erreur +=1
		try:
			reach = float(str(h[5].get_text()).split()[1][:2])
		except:
			reach = None
			erreur +=1
		try:
			feet = str(h[3].get_text().split()[1])
			feet_to_cm = float(feet[0])*30.48
			inches = str(h[3].get_text().split()[2])
			inches_to_cm = float(inches[0])*2.54
			height = str(int(feet_to_cm+inches_to_cm))
		except:
			height = None
			erreur +=1
		
		try: 
			name = ' '.join(map(str, li))
			if name not in dict_n :
				dict_n[name] = 0
			else :
				dict_n[name]= dict_n[name] +1
				print("key dict_n ===== ",dict_n[name])
			print(name)
		except:
			name = None
			erreur +=1
	except (HTTPError,URLError):
		pass 
	
	combattant_dict={'name': name, 'height': height, 'reach': reach, 'age': 2020 - year}
	print(combattant_dict)
	if dict_n[name] == 0:
		print("ok")
		dict_n[name]= dict_n[name] +1
		combattant_df = combattant_df.append(combattant_dict, ignore_index=True)
		combattant_df.to_csv('fighterFINAL.csv',index=False)

	cpt = cpt + 1
	if cpt == 350 :
		break
