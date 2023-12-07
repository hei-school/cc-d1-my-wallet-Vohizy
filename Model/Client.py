class Client:
    def __init__(self, nom, identifiant, portefeuille):
        self.nom = nom
        self.identifiant = identifiant
        self.portefeuille = portefeuille
        self.transactions = []

    def ajouter_transaction(self, montant, description, site_internet):
        transaction = {"montant": montant, "description": description, "site_internet": site_internet}
        self.transactions.append(transaction)