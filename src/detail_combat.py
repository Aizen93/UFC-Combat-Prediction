from bs4 import BeautifulSoup
import sys 
import pandas as panda
from urllib.error import HTTPError,URLError
import urllib.request
import os 
os.chdir('csv')

#Chargement des liens de list_combat
lien_combat=panda.read_csv('liste_combat.csv',encoding='utf-8-sig')

#Creation de notre dataframe avec les colonne qui nous interesse
combatant=panda.DataFrame(columns=['name', 'name_first','name_last','kd', 'sig_strikes', 'sig_attempts', 'strikes', 'strike_attempts', 
                                   'takedowns', 'td_attempts', 'sub_attempts', 'pass', 'reversals', 'head', 'head_attempts', 'body', 
                                   'body_attempts','leg', 'leg_attempts', 'distance', 'distance_attempts', 'clinch', 'fight_id','date',
                                   'clinch_attempts', 'ground', 'ground_attempts', 'win/loss', 'referee', 'round', 'method','title'])
#On parcour notre csv et pour chaque lien on recuperer les données qui nous interesse dans des variables
for i , row in lien_combat.iterrows():
    date=row['date'] #On recupere la date du combat 
    try:
        with urllib.request.urlopen(row['link']) as sock :
            fight_h=sock.read()
            combat_soup=BeautifulSoup(fight_h)
            trs=combat_soup.find_all('tr')
            balise_i=combat_soup.find_all('i')
            a=combat_soup.find_all('h3')
            erreur=0
            try:
                nm1=' '.join([ str(_) for _ in a[0].get_text().split() ])
                print(nm1)
            except:
                nm1="inconnue"
            try:
                nm2=' '.join([ str(_) for _ in a[1].get_text().split()])
                print(nm2)
            except:
                nm2="inconnue"
            try:
                titre=""
                if "Title" in str(balise_i[14].get_text().split()):
                    titre="yes"
                else:
                    titre="no"
                print(titre)
            except:
                print("erreur")
                continue
            try:
                win1=str(balise_i[12].get_text().split()[0])
                print(win1)
            except:
                win1=D
            try:
                win2=str(balise_i[13].get_text().split()[0])
            except:
                win2=D
            try: 
                referee = str(balise_i[24].get_text()).split()[1] + ' ' + str(balise_i[24].get_text()).split()[-1]
            except:
                referee = None
            try:
                rounds = str(balise_i[18].get_text()).split()[1]
            except:
                rounds = None
            try:
                method = str(balise_i[17].get_text()).split()[0]
            except:
                method = None
            try:
                tr1 = str(trs[1].get_text()).split()
                #On cherche la 2eme table qui correspond au 2eme combattant
                k=0
                while k<10:
                	print(str(trs[k].get_text()).split()[6])
                	if str(trs[k].get_text()).split()[6] == 'Head':
                		tr2=str(trs[k+1].get_text()).split()
                		k=10
                	else:
                		k=k+1
                
                z= 0
              
                #On cherche la fin du nom du commbattant pour recuperer les autre valeur en effet on a des combattant quit on 2 prenoms et donc si nous avuons un code statique cela creera des erreur 
                while z< len(tr1):
                    try:
                        print(tr1[z])
                        int(tr1[z])
                        break
                    except:
                        z += 1
                        continue
            except:
            	erreur+=1
            	continue

    except:
    	continue
    fighter1 = panda.DataFrame({'name':nm1, 'name_first': tr1[:1], 'name_last': tr1[1:2], 'kd': tr1[z], 'sig_strikes': tr1[z+2],
    'sig_attempts': tr1[z+4], 'strikes': tr1[z+10], 'strike_attempts': tr1[z+12], 'takedowns': tr1[z+16],'td_attempts': tr1[z+18],
    'sub_attempts': tr1[z+24], 'pass': tr1[z+26], 'reversals': tr1[z+28], 'head': tr2[z+8], 'head_attempts': tr2[z+10],
    'body': tr2[z+14], 'body_attempts': tr2[z+16], 'leg': tr2[z+20], 'leg_attempts': tr2[z+22], 'distance': tr2[z+26],
    'distance_attempts': tr2[z+28], 'clinch': tr2[z+32], 'clinch_attempts': tr2[z+34], 'ground': tr2[z+38], 
    'ground_attempts': tr2[z+40], 'win/loss': win1, 'referee': referee, 'round': rounds, 'method': method, 'fight_id': i , 'date':date,'title':titre})

    fighter2 = panda.DataFrame({'name':nm2,'name_first': tr1[2:3], 'name_last': tr1[3:4], 'kd': tr1[z+1], 'sig_strikes': tr1[z+5], 
    'sig_attempts': tr1[z+7], 'strikes': tr1[z+13], 'strike_attempts': tr1[z+15], 'takedowns': tr1[z+19],'td_attempts': tr1[z+21],
    'sub_attempts': tr1[z+25], 'pass': tr1[z+27], 'reversals': tr1[z+29], 'head': tr2[z+11], 'head_attempts': tr2[z+13],
    'body': tr2[z+17], 'body_attempts': tr2[z+19], 'leg': tr2[z+23], 'leg_attempts': tr2[z+25], 'distance': tr2[z+29],
    'distance_attempts': tr2[z+31], 'clinch': tr2[z+35], 'clinch_attempts': tr2[z+37], 'ground': tr2[z+41], 
    'ground_attempts': tr2[z+43], 'win/loss': win2, 'referee': referee, 'round': rounds, 'method': method, 'fight_id': i , 'date':date,'title':titre})
    
    combatant=panda.concat([combatant,fighter1,fighter2],axis=0 , ignore_index=True)
    combatant.to_csv('fightFINAL.csv',index=False)
    print("Fini")
