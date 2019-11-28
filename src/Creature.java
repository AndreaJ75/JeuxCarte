
public class Creature extends Card {
    private String name;
    private Integer damagePointsNbr;
    private Integer lifePointNbr;

    public Creature(CardType cardType, Integer cost, String name, Integer damagePointsNbr, Integer lifePointNbr){
        super(cardType, cost);
        this.name = name;
        this.damagePointsNbr = damagePointsNbr;
        this.lifePointNbr = lifePointNbr;
    }

    public String getName() {
        return name;
    }

    public Integer getDamagePointsNbr(){
        return damagePointsNbr;
    }

    public Integer getLifePointNbr(){
        return lifePointNbr;
    }

    @Override
    public void displayCostArgs() {
        super.displayCostArgs();

        System.out.println("Creature Name : " + name + "\n" + "Damage Number of points : " + damagePointsNbr +
                "\n" + " Life Number of points : " + lifePointNbr + "\n");

    }

}
