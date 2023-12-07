const BanqueController = require("../Controller/BanqueController");
const Client = require("../Model/Client");
const PortefeuilleElectronique = require("../Model/PortefeuilleElectronique");

const maBanque = new BanqueController();

const portefeuilleClient1 = new PortefeuilleElectronique(100, "Général");
const client1 = new Client("John Doe", "ID123", portefeuilleClient1);
maBanque.ajouterClient(client1);

console.log("Nom du Client 1 : " + client1.nom);
console.log("Identifiant du Client 1 : " + client1.identifiant);
console.log(
  "Solde du portefeuille du Client 1 : " + client1.portefeuille.getSolde()
);

maBanque.effectuerTransaction(client1, 50, "Achat d'une livre", "Amazon");
console.log(
  "Solde du portefeuille du Client 1 après transaction : " +
    client1.portefeuille.getSolde()
);
console.log("Liste des transactions du Client 1 : ");
console.log(client1.transactions);
console.log(
  "Solde total de la banque après transaction : " + maBanque.soldeTotal
);
