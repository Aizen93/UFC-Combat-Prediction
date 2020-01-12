from bs4 import BeautifulSoup
import sys 
import pandas as panda
from urllib.error import HTTPError,URLError
import urllib.request
import os 
os.chdir('csv')

with urllib.request.urlopen('http://ufcstats.com/statistics/events/completed') as sock:
	page=sock.read()
	soup=BeautifulSoup(page)

event_lien =[]
#On recupere les balise tr 
trs=soup.find_all('tr')
#On recupere les liens des tout les events
dates=[]
for e in trs:
	for lien in e.find_all('a'):
		event_lien.append(lien.get('href'))
	#event_date.append(e.find('span', {'class':'date'}))
    

t = soup.find('span',{'class':'b-statistics__date'})


print("---------------event_lien : \n")
print(event_lien, "\n")
print("---------------event_date : \n")
print(dates)