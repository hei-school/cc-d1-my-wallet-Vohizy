import Controller.BanqueController;
import Model.Client;
import Model.PortefeuilleElectronique;

public class Main {
    public static void main(String[] args) {
        BanqueController maBanque = new BanqueController();

        PortefeuilleElectronique portefeuilleClient1 = new PortefeuilleElectronique(100, "Général");
        Client client1 = new Client("John Doe", "ID123", portefeuilleClient1);
        maBanque.ajouterClient(client1);

        double montantTransaction = 50;
        String descriptionTransaction = "Achat d'une livre";
        String siteInternetTransaction = "Amazon";

        if (maBanque.effectuerTransaction(client1, montantTransaction, descriptionTransaction, siteInternetTransaction)) {
            System.out.println("Transaction réussie pour " + client1.getNom() + ". Nouveau solde : " + client1.getPortefeuille().getSolde());
            System.out.println("Liste des transactions de " + client1.getNom() + " : " + client1.transactionsToString());
            System.out.println("Solde total de la banque après transaction : " + maBanque.getSoldeTotal());
        } else {
            System.out.println("La transaction a échoué. Vérifiez le montant ou le solde disponible.");
        }
    }

}