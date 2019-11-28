public class Field extends Card {

    private FieldColor color;
    private Integer manaPointsNbr;


    public Field(CardType cardType, Integer cost, FieldColor color, Integer manaNbrPoints) {
        super(cardType, 0);
        this.color = color;
        this.manaPointsNbr = manaNbrPoints;
    }


    public FieldColor getColor() {
        return color;
    }

    public Integer getManaNbrPoints() {
        return manaPointsNbr;
    }

    @Override
    public void displayCostArgs() {
        super.displayCostArgs();

        System.out.println("Card color : " + color + "\n" + "Mana Points Number : " + manaPointsNbr + "\n");

    }
}
