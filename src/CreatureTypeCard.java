
public class CreatureTypeCard extends Card {
    private String name;
    private Integer damagePointsNbr;
    private Integer lifePointNbr;

    public CreatureTypeCard(CardType cardType, Integer cost, String name, Integer damagePointsNbr, Integer lifePointNbr){
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

        System.out.println("Nom de Créature : " + name + "\n" + "Nbr de points de dégâts : " + damagePointsNbr +
                "\n" + "Nbr de points de vie : " + lifePointNbr + "\n");

    }

}
