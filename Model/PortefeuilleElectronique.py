class PortefeuilleElectronique:
    def __init__(self, solde_initial=0, categorie="Général"):
        self.solde = solde_initial
        self.categorie = categorie

    def get_solde(self):
        return self.solde

    def deposer(self, montant):
        if montant > 0:
            self.solde += montant
            return True
        else:
            return False

    def retirer(self, montant):
        if 0 < montant <= self.solde:
            self.solde -= montant
            return True
        else:
            return False