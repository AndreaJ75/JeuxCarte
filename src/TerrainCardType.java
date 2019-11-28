public class TerrainCardType extends Card {

    private ColorTerrain color;
    private Integer manaNbrPoints;


    public TerrainCardType(CardType cardType, Integer cost, ColorTerrain color, Integer manaNbrPoints) {
        super(cardType, 0);
        this.color = color;
        this.manaNbrPoints = manaNbrPoints;
    }


    public ColorTerrain getColor() {
        return color;
    }

    public Integer getManaNbrPoints() {
        return manaNbrPoints;
    }

    @Override
    public void displayCostArgs() {
        super.displayCostArgs();

        System.out.println("Couleur de carte : " + color + "\n" + "Nbr de points de mana : " + manaNbrPoints + "\n");

    }
}
