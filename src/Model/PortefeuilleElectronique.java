package Model;

public class PortefeuilleElectronique {
    private double solde;
    private String categorie;

    public PortefeuilleElectronique(double soldeInitial, String categorie) {
        this.solde = soldeInitial;
        this.categorie = categorie;
    }

    public double getSolde() {
        return solde;
    }

    public boolean deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            return true;
        } else {
            return false;
        }
    }

    public boolean retirer(double montant) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;
            return true;
        } else {
            return false;
        }
    }
}
