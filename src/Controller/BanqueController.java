package Controller;

import Model.Client;

import java.util.ArrayList;
import java.util.List;

public class BanqueController {
    private List<Client> clients;
    private double soldeTotal;

    public BanqueController() {
        this.clients = new ArrayList<>();
        this.soldeTotal = 0;
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public boolean effectuerTransaction(Client client, double montant, String description, String siteInternet) {
        if (client.getPortefeuille().retirer(montant)) {
            client.ajouterTransaction(montant, description, siteInternet);
            this.soldeTotal += montant;
            return true;
        } else {
            return false;
        }
    }

    public double getSoldeTotal() {
        return soldeTotal;
    }

}
