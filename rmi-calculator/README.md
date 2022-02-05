# Exemple Calculator JavaRmi 
### rmiregistry
![img_2.png](docs/img_2.png)
> Lancer le gestionnaire de registres qui vient avec Java RMI sur le port 1099 de la machine hote 
> (par defaut) comme un service de Naming.
> - Faire bind des services du serveur
> - Aide le client a trouver l'adresse de l'objet cherché
### Server
![img_1.png](docs/img_1.png)
> Declancher le serveur comme Daemon pour attendre les requettes des clients sur <b>rmi://localhost:1099/CalculatorService</b>
### Client
![img_3.png](docs/img_3.png)
> Appel a distance du service Calculator sur <b>rmi://localhost/CalculatorService</b>