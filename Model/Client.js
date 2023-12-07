class Client {
  constructor(nom, identifiant, portefeuille) {
    this.nom = nom;
    this.identifiant = identifiant;
    this.portefeuille = portefeuille;
    this.transactions = [];
  }

  ajouterTransaction(montant, description, siteInternet) {
    const transaction = {
      montant,
      description,
      siteInternet,
      date: new Date(),
    };
    this.transactions.push(transaction);
  }
}
module.exports = Client;
