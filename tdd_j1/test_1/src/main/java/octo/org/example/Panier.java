package octo.org.example;

public class Panier {
   int NombreTomeI = 0;
   int NombreTomeII = 0;
   int NombreTomeIII = 0;
   int NombreTomeIV = 0;
   int NombreTomeV = 0;

    public Panier(int nombreTomeI, int nombreTomeII, int nombreTomeIII, int nombreTomeIV, int nombreTomeV) {
        NombreTomeI = nombreTomeI;
        NombreTomeII = nombreTomeII;
        NombreTomeIII = nombreTomeIII;
        NombreTomeIV = nombreTomeIV;
        NombreTomeV = nombreTomeV;
    }

    private final int PRIX_LIVRE_EN_CENTIME = 800;

    private int nombreDeLivreDifferent(){
        int nombreDeLivreDifferent = 0;
        if (NombreTomeI > 0)  nombreDeLivreDifferent++;
        if (NombreTomeII > 0)  nombreDeLivreDifferent++;
        if (NombreTomeIII > 0)  nombreDeLivreDifferent++;
        if (NombreTomeIV > 0)  nombreDeLivreDifferent++;
        if (NombreTomeV > 0)  nombreDeLivreDifferent++;
        return nombreDeLivreDifferent;
    }

    private int nombreTotalDeLivre(){
        return NombreTomeI + NombreTomeII + NombreTomeIII + NombreTomeIV + NombreTomeV;
    }

    public int calculPrixFinalPanier() {
        int finalPrice = 0;
        if(this.nombreDeLivreDifferent() == 0) finalPrice = 0;
        if (this.nombreDeLivreDifferent() == 1) finalPrice = this.PRIX_LIVRE_EN_CENTIME;
        if (this.nombreDeLivreDifferent() == 2) finalPrice = (int) (this.nombreTotalDeLivre() * this.PRIX_LIVRE_EN_CENTIME * 0.95);
        if (this.nombreDeLivreDifferent() == 3) finalPrice = (int) (this.nombreTotalDeLivre() * this.PRIX_LIVRE_EN_CENTIME * 0.90);
        if (this.nombreDeLivreDifferent() == 4) finalPrice = (int) (this.nombreTotalDeLivre() * this.PRIX_LIVRE_EN_CENTIME * 0.80);
        if (this.nombreDeLivreDifferent() == 5) finalPrice = (int) (this.nombreTotalDeLivre() * this.PRIX_LIVRE_EN_CENTIME * 0.75);

       return finalPrice;

    }
}