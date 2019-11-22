import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JeuCarte {

    private List<Carte> cardCollect;
    private Integer nbrCarteJeu;
    private Integer nbrCardMax;

    public JeuCarte(List<Carte> cardCollect, Integer nbrCarteJeu, Integer nbrCardMax) {
        this.cardCollect = cardCollect;
        this.nbrCarteJeu = nbrCarteJeu;
        this.nbrCardMax = nbrCardMax;
    }

    public List<Carte> getCardCollect() {
        return cardCollect;
    }

    public Integer getNbrCarte() {
        return nbrCarteJeu;
    }

    public Integer getNbrCardMax() {
        return nbrCardMax;
    }

    public void setCardCollect(List cardCollect) {
        this.cardCollect = cardCollect;
    }

    public void setNbrCarte(Integer nbrCarte) {
        this.nbrCarteJeu = nbrCarteJeu;
    }

    public void setNbrCardMax(Integer nbrCardMax) {
        this.nbrCardMax = nbrCardMax;
    }


    public void piocherCarte(Carte cartePioch) {

        System.out.println(" ************* PIOCHE CARTE  *******************");
        cardCollect.add(cartePioch);
        nbrCarteJeu = nbrCarteJeu + 1;

        System.out.println("NBR de carte pioché : " + nbrCarteJeu);

        cartePioch.displayCardType();
        cartePioch.displayCostArgs();
    }

    public void AfficheJeu(){
        System.out.println(" ****** AFFICHER JEU  ******** ");
        for (int i = 0; i < cardCollect.size(); i++) {
            cardCollect.get(i).displayCardType();
            cardCollect.get(i).displayCostArgs();
        }


    }


    public void joueCarte(Carte cartejoue){

        System.out.println("******* AVANT JOUER ********");
        System.out.println("NBR carte dans le Jeu : " +  nbrCarteJeu);
        cartejoue.displayCardType();
        cartejoue.displayCostArgs();

        cardCollect.remove(cartejoue);
        nbrCarteJeu = nbrCarteJeu - 1 ;

        cartejoue = null;

        System.out.println("******** APRES JOUER ***********");
        System.out.println("NBR de carte du jeu : " + nbrCarteJeu);

        AfficheJeu();


    }

}
