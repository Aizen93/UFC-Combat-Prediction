from bs4 import BeautifulSoup
import sys 
import pandas as panda
from urllib.error import HTTPError,URLError
import urllib.request
import os 
os.chdir('csv')

with urllib.request.urlopen('http://www.fightmetric.com/statistics/events/completed?page=all') as sock:
	page=sock.read()
	soup=BeautifulSoup(page)

event_lien =[]
#On recupere les balise tr 
trs=soup.find_all('tr')
#On recupere les liens des tout les events
for e in trs:
	for lien in e.find_all('a'):
		event_lien.append(lien.get('href'))

fight_lien=[]
date=[]
for lien_url in event_lien:
	print(lien_url)
	try:
		with urllib.request.urlopen(lien_url) as sock:
			event_p=sock.read()
			beautisoup=BeautifulSoup(event_p)

		#On recupere tout les liens des combats ou des combattants qui se trouve dans la balise li qui se trouve dans les balise td

		tds=beautisoup.find_all('td')
		lis=beautisoup.find_all('li')
		for balise_td in tds:
			for lien in balise_td.find_all('a'):
				url=lien.get('href')
				#on test si lurl recuperer est pas nul
				if url is not None:
					#On recupere les liens contenu dans la balise href
					type_url=url.split('-')[0][-2:]
					#Il ya 2 types de liens les liens qui mene au detail du combat , et les liens qui menne au differents commbattant qui participe au combats
					if type_url =='ht': #Le lien reccuperer et de la forme ....fight|fighter donc on a spliter le lien et on test la fin du lien , si sa fini par "er"alors on recupere le lien qui mene au commbattant si cest "ht" on recupere le lien du combat
						fight_lien.append(url)
						date.append((lis[8].getText().split()[1] +lis[8].getText().split()[2]+lis[8].getText().split()[3]))


	except (HTTPError,URLError):
		pass

#On sauvegarde les url dans un csv si on veut les combat laissez tel quel sinon mettre finale= et finale.to_csv en commentaire
csv_lien_fight=panda.DataFrame(fight_lien,columns=['link'])
datee=panda.DataFrame(date,columns=['date'])
finale =panda.concat([csv_lien_fight,datee],axis=1)
finale.to_csv('liste_combat.csv',index=False)
#csv_lien_fight.to_csv('liste_combattant.csv',index=False)
