import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println(" ************** SIMPLE DISPLAY CARTE DEBUT ***************");
        Carte carte1 = new TerrainCarteType(CardType.TERRAIN, 3, "Bleu", 2);

        carte1.displayCardType();
        carte1.displayCostArgs();


        Carte carte2 = new CreatureTypeCarte(CardType.CREATURE, 5, "SylverCrush", 7, 5);

        carte2.displayCardType();
        carte2.displayCostArgs();

        Carte carte3 = new SortilegeCarteType(CardType.SORTILEGE, 8, "Dynamolition", "Couvrir de dynamite l'ensemble de la cible");

        carte3.displayCardType();
        carte3.displayCostArgs();

        System.out.println(" ************** SIMPLE DISPLAY CARTE FIN FIN  ***************");

        Carte carte4 = new TerrainCarteType(CardType.TERRAIN, 3, "rouge", 5);
        Carte carte5 = new CreatureTypeCarte(CardType.CREATURE, 10, "Vizir", 2, 4);
        Carte carte6 = new CreatureTypeCarte(CardType.CREATURE, 3, "Sarmonce", 3, 24);
        Carte carte7 = new TerrainCarteType(CardType.TERRAIN, 3, "jaune", 3);
        Carte carte8 = new TerrainCarteType(CardType.TERRAIN, 5, "vert", 1);
        Carte carte9 = new SortilegeCarteType(CardType.SORTILEGE, 12, "Barkadam", "souffle tel le vent");
        Carte carte10 = new SortilegeCarteType(CardType.SORTILEGE, 4, "Biskarros", "disparaît et devient invisible");
        Carte carte11 = new CreatureTypeCarte(CardType.CREATURE, 3, "Baloon", 23, 2);
        Carte carte12 = new TerrainCarteType(CardType.TERRAIN, 15, "marron", 11);
        Carte carte13 = new SortilegeCarteType(CardType.SORTILEGE, 6, "Steaddy", "fige la cible visé");
        Carte carte14 = new SortilegeCarteType(CardType.SORTILEGE, 7, "Biznage", "coule la cible visé");

        List<Carte> cardCollection = new ArrayList<>();
        List<Carte> cardsAll = new ArrayList<>();


        cardsAll.add(carte1);
        cardsAll.add(carte2);
        cardsAll.add(carte3);
        cardsAll.add(carte4);
        cardsAll.add(carte5);
        cardsAll.add(carte6);
        cardsAll.add(carte7);
        cardsAll.add(carte8);
        cardsAll.add(carte9);
        cardsAll.add(carte10);
        cardsAll.add(carte11);
        cardsAll.add(carte12);
        cardsAll.add(carte13);
        cardsAll.add(carte14);
        cardsAll.add(carte11);

        JeuCarte cardCollect = new JeuCarte(cardCollection, 0, 5);
        // Rajouter les méthodes
        // * Piocher

        //cardCollect.piocherCarte(carte1);

        System.out.println(" **************************************************** ");

        for (Carte carte : cardsAll) {
            if (cardCollection.size() < cardCollect.getNbrCardMax()) {
                cardCollect.piocherCarte(carte);
            }

        }

        // * Jouer Carte :

        //System.out.println("selection d'une carte de collection : " + cardCollection.get(0));


        // Jouer avec les Cast...
        //TerrainCarteType carteTest = new Carte;
        //carteTest = (TerrainCarteType) cardCollection.get(0);

        cardCollect.joueCarte(cardCollection.get(0));


        // * Afficher Jeu-Carte

        System.out.println(" **************************************************** ");
    }
}
