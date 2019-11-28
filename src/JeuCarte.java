import java.util.List;

public class JeuCarte {

    private List<Card> cardCollect;
    private Integer nbrCardMax;

    public JeuCarte(List<Card> cardCollect, Integer nbrCardMax) {
        this.cardCollect = cardCollect;
        this.nbrCardMax = nbrCardMax;
    }

    public List<Card> getCardCollect() {
        return cardCollect;
    }

    public Integer getNbrCardMax() {
        return nbrCardMax;
    }

    public void setCardCollect(List cardCollect) {
        this.cardCollect = cardCollect;
    }

    public void setNbrCardMax(Integer nbrCardMax) {
        this.nbrCardMax = nbrCardMax;
    }


    public void piocherCarte(Card cardPioch) {

        System.out.println(" ************* PIOCHE CARTE  *******************");
        cardCollect.add(cardPioch);

        System.out.println("NBR de carte pioché : " + cardCollect.size() );

        cardPioch.displayCardType();
        cardPioch.displayCostArgs();
    }

    public void AfficheJeu(){
        System.out.println(" ****** AFFICHER JEU  ******** ");
        for (int i = 0; i < cardCollect.size(); i++) {
            cardCollect.get(i).displayCardType();
            cardCollect.get(i).displayCostArgs();
        }
        System.out.println("Nbr max : " + nbrCardMax);


    }


    public void joueCarte(Card cartejoue){

        System.out.println("******* AVANT JOUER ********");
        System.out.println("NBR carte dans le Jeu : " +  cardCollect.size());
        cartejoue.displayCardType();
        cartejoue.displayCostArgs();

        cardCollect.remove(cartejoue);

        cartejoue = null;

        System.out.println("******** APRES JOUER ***********");
        System.out.println("NBR de carte du jeu : " + cardCollect.size());

        AfficheJeu();


    }

}
