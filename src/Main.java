import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println(" ************** SIMPLE CARD DISPLAY  ---- START ***************");
        Card card1 = new Field(CardType.FIELD, 3, FieldColor.blue, 2);

        card1.displayCardType();
        card1.displayCostArgs();


        Card card2 = new Creature(CardType.CREATURE, 5, "SylverCrush", 7, 5);

        card2.displayCardType();
        card2.displayCostArgs();

        Card card3 = new Curse(CardType.CURSE, 8, "Dynamolition", "Destroy its target covering it with dynamite");

        card3.displayCardType();
        card3.displayCostArgs();

        System.out.println(" ************** SIMPLE CARD DISPLAY ---- END  ***************");

        Card card4 = new Field(CardType.FIELD, 3, FieldColor.red, 5);
        Card card5 = new Creature(CardType.CREATURE, 10, "Vizir", 2, 4);
        Card card6 = new Creature(CardType.CREATURE, 3, "Sarmonce", 3, 24);
        Card card7 = new Field(CardType.FIELD, 3, FieldColor.black, 3);
        Card card8 = new Field(CardType.FIELD, 5, FieldColor.green, 1);
        Card card9 = new Curse(CardType.CURSE, 12, "Barkadam", "Make its owner blow like the wind");
        Card card10 = new Curse(CardType.CURSE, 4, "Biskarros", "Make its owner become invisible");
        Card card11 = new Creature(CardType.CREATURE, 3, "Baloon", 23, 2);
        Card card12 = new Field(CardType.FIELD, 15, FieldColor.white, 11);
        Card card13 = new Curse(CardType.CURSE, 6, "Steaddy", "Makes its target steady");
        Card card14 = new Curse(CardType.CURSE, 7, "Biznage", "Sinks its target");

        List<Card> cardCollection = new ArrayList<>();
        List<Card> cardsAll = new ArrayList<>();

        cardsAll.add(card1);
        cardsAll.add(card2);
        cardsAll.add(card3);
        cardsAll.add(card4);
        cardsAll.add(card5);
        cardsAll.add(card6);
        cardsAll.add(card7);
        cardsAll.add(card8);
        cardsAll.add(card9);
        cardsAll.add(card10);
        cardsAll.add(card11);
        cardsAll.add(card12);
        cardsAll.add(card13);
        cardsAll.add(card14);
        cardsAll.add(card11);

        CardPlayer cardCollect = new CardPlayer(cardCollection, 10);

        // * Piocher toutes les cartes jusqu'à arriver au max de carte prévu pour 1 joueur.
        //cardCollect.drawCard(carte1);

        System.out.println(" **************************************************** ");

        for (Card card : cardsAll) {
            if (cardCollection.size() < cardCollect.getMaxCardNbr()) {
                cardCollect.drawCard(card);
            }
        }

        // * Jouer Carte :
        //System.out.println("selection d'une carte de collection : " + cardCollection.get(0));

        Card firstCard = cardCollection.get(0);
        cardCollect.playCard(firstCard);

        if (firstCard == null) {
            System.out.println("No more linked cards");
        } else {
            firstCard.displayCardType();
        }

        // * Afficher Jeu-Carte
        System.out.println(" **************************************************** ");

        cardCollect.displayPlayerGame();

        System.out.println(" **************************************************** ");
    }
}
