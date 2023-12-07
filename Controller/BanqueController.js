const Client = require("../Model/Client");
const PortefeuilleElectronique = require("../Model/PortefeuilleElectronique");

class BanqueController {
  constructor() {
    this.clients = [];
    this.soldeTotal = 0;
  }

  ajouterClient(client) {
    this.clients.push(client);
  }

  effectuerTransaction(client, montant, description, siteInternet) {
    if (client.portefeuille.retirer(montant)) {
      client.ajouterTransaction(montant, description, siteInternet);
      this.soldeTotal += montant;
      return true;
    } else {
      return false;
    }
  }
}

module.exports = BanqueController;
