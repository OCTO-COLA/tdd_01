package octo.org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PanierTest {

    @Test
    public void panierSansTomeCouteZeroEuros(){
        Panier panier = new Panier(0, 0, 0, 0, 0);
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(0, prixFinal);
    }

    @Test
    public void panierAvecUnTomeCouteHuitEuros(){
        Panier panier = new Panier(1,0,0,0,0);
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(800, prixFinal);
    }

    @Test
    public void panierAvecDeuxTomesDifferentAppliqueUneReductionDeCinqPourCent(){
        Panier panier = new Panier(1,1,0,0,0 );
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(1520, prixFinal);
    }
    @Test
    public void panierAvecTroisTomesDifferentAppliqueUneReductionDeDixPourCent() {
        Panier panier = new Panier(1,1,1,0,0 );
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(2160, prixFinal);
    }
    @Test
    public void panierAvecQuatresTomesDifferentAppliqueUneReductionDeVinghtPourCent() {
        Panier panier = new Panier(1,1,1,1,0 );
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(2560, prixFinal);
    }
    @Test
    public void panierAvecCinqTomesDifferentAppliqueUneReductionDeVinghtCinqPourCent() {
        Panier panier = new Panier(1,1,1,1,1);
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(3000, prixFinal);
    }
    @Test
    public void panierAvecTroisTomesDontDeuxSontDifferent() {
        Panier panier = new Panier(2,1,0,0,0);
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(2280, prixFinal);
    }
    @Test
    public void panierAvecDouzeTomesDontTroisSontDifferent() {
        Panier panier = new Panier(10,1,1,0,0);
        int prixFinal = panier.calculPrixFinalPanier();
        Assertions.assertEquals(8640, prixFinal);
    }
}