import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println(" ************** SIMPLE DISPLAY CARTE DEBUT ***************");
        Card card1 = new TerrainCardType(CardType.TERRAIN, 3, ColorTerrain.bleu, 2);

        card1.displayCardType();
        card1.displayCostArgs();


        Card card2 = new CreatureTypeCard(CardType.CREATURE, 5, "SylverCrush", 7, 5);

        card2.displayCardType();
        card2.displayCostArgs();

        Card card3 = new SortilegeCardType(CardType.SORTILEGE, 8, "Dynamolition", "Couvrir de dynamite l'ensemble de la cible");

        card3.displayCardType();
        card3.displayCostArgs();

        System.out.println(" ************** SIMPLE DISPLAY CARTE FIN FIN  ***************");

        Card card4 = new TerrainCardType(CardType.TERRAIN, 3, ColorTerrain.rouge, 5);
        Card card5 = new CreatureTypeCard(CardType.CREATURE, 10, "Vizir", 2, 4);
        Card card6 = new CreatureTypeCard(CardType.CREATURE, 3, "Sarmonce", 3, 24);
        Card card7 = new TerrainCardType(CardType.TERRAIN, 3, ColorTerrain.noir, 3);
        Card card8 = new TerrainCardType(CardType.TERRAIN, 5, ColorTerrain.vert, 1);
        Card card9 = new SortilegeCardType(CardType.SORTILEGE, 12, "Barkadam", "souffle tel le vent");
        Card card10 = new SortilegeCardType(CardType.SORTILEGE, 4, "Biskarros", "disparaît et devient invisible");
        Card card11 = new CreatureTypeCard(CardType.CREATURE, 3, "Baloon", 23, 2);
        Card card12 = new TerrainCardType(CardType.TERRAIN, 15, ColorTerrain.blanc, 11);
        Card card13 = new SortilegeCardType(CardType.SORTILEGE, 6, "Steaddy", "fige la cible visé");
        Card card14 = new SortilegeCardType(CardType.SORTILEGE, 7, "Biznage", "coule la cible visé");

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

        JeuCarte cardCollect = new JeuCarte(cardCollection, 10);

        // * Piocher toutes les cartes jusqu'à arriver au max de carte prévu pour 1 joueur.

        //cardCollect.piocherCarte(carte1);

        System.out.println(" **************************************************** ");

        for (Card card : cardsAll) {
            if (cardCollection.size() < cardCollect.getNbrCardMax()) {
                cardCollect.piocherCarte(card);
            }
        }

        // * Jouer Carte :

        //System.out.println("selection d'une carte de collection : " + cardCollection.get(0));

        Card firstCard = cardCollection.get(0);
        cardCollect.joueCarte(firstCard);

        if (firstCard == null) {
            System.out.println("Plus de carte associée");
        } else {
            firstCard.displayCardType();
        }

        // * Afficher Jeu-Carte
        System.out.println(" **************************************************** ");

       // cardCollect.AfficheJeu();

        System.out.println(" **************************************************** ");
    }
}
