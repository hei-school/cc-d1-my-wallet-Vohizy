package Model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String identifiant;
    private PortefeuilleElectronique portefeuille;
    private List<Transaction> transactions;

    public Client(String nom, String identifiant, PortefeuilleElectronique portefeuille) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.portefeuille = portefeuille;
        this.transactions = new ArrayList<>();
    }

    public void ajouterTransaction(double montant, String description, String siteInternet) {
        Transaction transaction = new Transaction(montant, description, siteInternet);
        this.transactions.add(transaction);
    }

    public String getNom() {
        return nom;
    }

    public PortefeuilleElectronique getPortefeuille() {
        return portefeuille;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    // Méthode pour obtenir une représentation lisible des transactions
    public String transactionsToString() {
        StringBuilder result = new StringBuilder();
        for (Transaction transaction : transactions) {
            result.append("Montant: ").append(transaction.getMontant())
                    .append(", Description: ").append(transaction.getDescription())
                    .append(", Site Internet: ").append(transaction.getSiteInternet())
                    .append(", Date: ").append(transaction.getDate())
                    .append("\n");
        }
        return result.toString();
    }
}
