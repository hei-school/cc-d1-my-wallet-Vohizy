class PortefeuilleElectronique:
    def __init__(self, solde_initial=0, categorie="Général"):
        self.solde = solde_initial
        self.categorie = categorie

    def get_solde(self):
        return self.solde