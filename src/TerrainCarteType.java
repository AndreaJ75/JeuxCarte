public class TerrainCarteType extends Carte {

    private String color;
    private Integer manaNbrPoints;


    public TerrainCarteType(CardType cardType, Integer cost, String color, Integer manaNbrPoints) {
        super(cardType, cost);
        this.color = color;
        this.manaNbrPoints = manaNbrPoints;
    }


    public String getColor() {
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
