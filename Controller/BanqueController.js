const Client = require("../Model/Client");

class BanqueController {
  constructor() {
    this.clients = [];
    this.soldeTotal = 0;
  }

  ajouterClient(client) {
    this.clients.push(client);
  }
}

module.exports = BanqueController;
