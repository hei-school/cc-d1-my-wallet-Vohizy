from Controller.BanqueController import BanqueController
from Model.Client import Client
from Model.PortefeuilleElectronique import PortefeuilleElectronique

ma_banque = BanqueController()

portefeuille_client1 = PortefeuilleElectronique(100, "Général")
client1 = Client("John Doe", "ID123", portefeuille_client1)
ma_banque.ajouter_client(client1)

# Effectuer une transaction
montant_transaction = 50
description_transaction = "Achat d'une livre"
site_internet_transaction = "Amazon"

if ma_banque.effectuer_transaction(client1, montant_transaction, description_transaction, site_internet_transaction):
    print(f"Transaction réussie pour {client1.nom}. Nouveau solde : {client1.portefeuille.get_solde()}")
    print(f"Liste des transactions de {client1.nom} : {client1.transactions}")
    print(f"Solde total de la banque après transaction : {ma_banque.solde_total}")
else:
    print("La transaction a échoué. Vérifiez le montant ou le solde disponible.")