from Model.Client import Client
from Model.PortefeuilleElectronique import PortefeuilleElectronique

class BanqueController:
    def __init__(self):
        self.clients = []
        self.solde_total = 0

    def ajouter_client(self, client):
        self.clients.append(client)

    def effectuer_transaction(self, client, montant, description, site_internet):
        if client.portefeuille.retirer(montant):
            client.ajouter_transaction(montant, description, site_internet)
            self.solde_total += montant
            return True
        else:
            return False