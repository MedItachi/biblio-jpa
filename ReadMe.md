# API Rest pour la gestion de bibliothèque
Nous appelons API REST toute solution Web permettant de
dèsservir des objets "JSON" (ou XML) plutot que des pages web
selon les conventions d'une architecture REST.


## 1. Requétes HTTP Rest :
Une architecture Rest se base sur le protocole HTTP et un
ensemble de conventions HTTP basées sur des méthodes HTTP
classiques. Ainsi pour l'echange d'auteurs par example,on
ulisera les conventions suivantes :

````
GET 	/biblio/authors
GETR 	/biblio/authors/[id]
POST  /biblio/authors
PUT	 /biblio/authors/[id]
DELETE /biblio/authors/[id]
````
