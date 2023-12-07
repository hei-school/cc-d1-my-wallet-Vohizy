class Client {
  constructor(nom, identifiant, portefeuille) {
    this.nom = nom;
    this.identifiant = identifiant;
    this.portefeuille = portefeuille;
    this.transactions = [];
  }
}
module.exports = Client;
