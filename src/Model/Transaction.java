package Model;

import java.util.Date;

public class Transaction {
    private double montant;
    private String description;
    private String siteInternet;
    private Date date;

    public Transaction(double montant, String description, String siteInternet) {
        this.montant = montant;
        this.description = description;
        this.siteInternet = siteInternet;
        this.date = new Date();
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
