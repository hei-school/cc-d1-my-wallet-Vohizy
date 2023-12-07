class PortefeuilleElectronique {
  constructor(soldeInitial = 0, categorie = "Général") {
    this.solde = soldeInitial;
    this.categorie = categorie;
  }

  getSolde() {
    return this.solde;
  }

  getCategorie() {
    return this.categorie;
  }

  deposer(montant) {
    if (montant > 0) {
      this.solde += montant;
      return true;
    } else {
      return false;
    }
  }

  retirer(montant) {
    if (montant > 0 && montant <= this.solde) {
      this.solde -= montant;
      return true;
    } else {
      return false;
    }
  }
}
module.exports = PortefeuilleElectronique;
