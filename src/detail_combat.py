from bs4 import BeautifulSoup
import sys 
import pandas as panda
from urllib.error import HTTPError,URLError
import urllib.request
import os 
os.chdir('csv')


#Chargement des liens de list_combat
lien_combat=panda.read_csv('liste_combat.csv',encoding='utf-8-sig')

#Creating dataframe and declaring the data rows name
combatant=panda.DataFrame(columns=['fight_id', 'name_first','name_last','kd', 'sig_strikes', 'sig_attempts', 'strikes', 'strike_attempts', 
                                   'takedowns', 'td_attempts', 'sub_attempts', 'pass', 'reversals', 'head', 'head_attempts', 'body', 
                                   'body_attempts','leg', 'leg_attempts', 'distance', 'distance_attempts', 'clinch', 'name','date',
                                   'clinch_attempts', 'ground', 'ground_attempts', 'win/loss', 'referee', 'round', 'method','title'])

total_fight = 5562
current_fight = 0

#Now that we have all the fight links file we can loop in it to scrape all the relevant data we need in the source code and store it in a csv 
for i , row in lien_combat.iterrows():
    #Get date of fight
    date=row['date'] 
    current_fight += 1
    percentage = (current_fight/total_fight)*100
    print("Loading... ",percentage,"%")
    try:
        with urllib.request.urlopen(row['link']) as sock :
            fight_h=sock.read()
            combat_soup=BeautifulSoup(fight_h)
            trs=combat_soup.find_all('tr')
            balise_i=combat_soup.find_all('i')
            a=combat_soup.find_all('h3')
            sppan=combat_soup.find_all('span')
            #imgs = combat_soup.find_all('img')
            erreur=0
            #Get The first fighter's name
            try:
                nm1=' '.join([ str(_) for _ in a[0].get_text().split() ])
                print(nm1)
            except:
                nm1="inconnue"
            #Get The second fighter's name
            try:
                nm2=' '.join([ str(_) for _ in a[1].get_text().split()])
                print(nm2)
            except:
                nm2="inconnue"
            #Check if it's a title fight or not
            try:
                titre=""
                #print(balise_i[2].find('img').get('src'))
                for belt in balise_i[2]:
                    if "http://1e49bc5171d173577ecd-1323f4090557a33db01577564f60846c.r80.cf1.rackcdn.com/belt.png" in balise_i[2].find('img').get('src'):
                        #An image of a belt was found so it's a title fight.
                        titre="yes"
                    else:
                        #An image was found but it wasn't a belt image. So not a title fight.
                        titre="no"
                print(titre)
            except:
                #No image found so it's not a title fight
                print("no belt")
                titre = "no"
            #Check if fighter 1 is the winner or loser of the fight            
            try:
                win1=str(balise_i[0].get_text().split()[0])
                print(win1)
            except:
                #No winner so it's a draw
                win1=D
            #Check if fighter 2 is the winner or loser of the fight 
            try:
                win2=str(balise_i[1].get_text().split()[0])
            except:
                #No winner so it's a draw
                win2=D
            #Get the referee's name
            try: 
                referee = str(sppan[0].get_text()).split()[0] + ' ' + str(sppan[0].get_text()).split()[1]
            except:
                referee = None
            #Get the number of the fight's rounds
            try:
                rounds = str(balise_i[6].get_text()).split()[1]
            except:
                rounds = None
            #Get the winning method
            try:
                method = str(balise_i[5].get_text()).split()[0]
            except:
                method = None
            #Get the first and last name of the fighters as well as other stats during the fight
            try:
                tr1 = str(trs[1].get_text()).split()
                #We look for the information of the second fighter
                k=0
                while k<10:
                	if str(trs[k].get_text()).split()[6] == 'Head':
                		tr2=str(trs[k+1].get_text()).split()
                		k=10
                	else:
                		k=k+1
                
                z= 0
              
                #On cherche la fin du nom du commbattant pour recuperer les autre valeur en effet on a des combattant qui ont 2 prenoms 
                # et donc si nous avuons un code statique cela creera des erreur 
                while z< len(tr1):
                    try:
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
    'ground_attempts': tr2[z+40], 'win/loss': win1, 'referee': referee, 'round': rounds, 'method': method, 'fight_id': i , 'date':date.split(",")[1],'title':titre})

    fighter2 = panda.DataFrame({'name':nm2,'name_first': tr1[2:3], 'name_last': tr1[3:4], 'kd': tr1[z+1], 'sig_strikes': tr1[z+5], 
    'sig_attempts': tr1[z+7], 'strikes': tr1[z+13], 'strike_attempts': tr1[z+15], 'takedowns': tr1[z+19],'td_attempts': tr1[z+21],
    'sub_attempts': tr1[z+25], 'pass': tr1[z+27], 'reversals': tr1[z+29], 'head': tr2[z+11], 'head_attempts': tr2[z+13],
    'body': tr2[z+17], 'body_attempts': tr2[z+19], 'leg': tr2[z+23], 'leg_attempts': tr2[z+25], 'distance': tr2[z+29],
    'distance_attempts': tr2[z+31], 'clinch': tr2[z+35], 'clinch_attempts': tr2[z+37], 'ground': tr2[z+41], 
    'ground_attempts': tr2[z+43], 'win/loss': win2, 'referee': referee, 'round': rounds, 'method': method, 'fight_id': i , 'date':date.split(",")[1],'title':titre})
    
    combatant=panda.concat([combatant,fighter1,fighter2],axis=0 , ignore_index=True)
    combatant.to_csv('fightFINAL.csv',index=False)
    print("This data set contains: ",erreur," errors.")
    print("Fini")