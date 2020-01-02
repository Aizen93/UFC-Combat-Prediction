from bs4 import BeautifulSoup
import pandas as panda
import urllib.request
from urllib.error import HTTPError, URLError

import os
os.chdir('csv')

lien_combattant=panda.read_csv('liste_combattant.csv',encoding='utf-8')

#creation d'une dataFrame
combattant_df = panda.DataFrame(columns=['name', 'height', 'reach', 'age'])

for i,row in lien_combattant.iterrows():
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
			year = int(str(h[12].get_text().split()[-1]))
		except:
			year = 0
			erreur +=1
		try:
			reach = float(str(h[10].get_text()).split()[1][:2])
		except:
			reach = None
			erreur +=1
		try:
			height = str(h[8].get_text().split()[1])+(str(h[8].get_text().split()[2]))
		except:
			height = None
			erreur +=1
		
		try: 
			name = ' '.join(map(str, li))
			print(name)
		except:
			name = None
			erreur +=1
	except (HTTPError,URLError):
		pass 

	combattant_dict={'name': name, 'height': height, 'reach': reach, 'age': 2016 - year}
	print(combattant_dict)
	if name not in dict_n:
		dict_n[name]=0
		print("ok")
		combattant_df = combattant_df.append(combattant_dict, ignore_index=True)
	combattant_df.to_csv('fighterFINAL.csv',index=False)





