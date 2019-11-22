
public class SortilegeCarteType extends Carte {

    private String name;
    private String explanation;

    public SortilegeCarteType(CardType cardType, Integer cost, String name, String explanation){
        super(cardType,cost);
        this.name = name;
        this.explanation = explanation;
    }

    public String getName(){
        return name;
    }

    public String getExplanation(){
        return explanation;
    }

    @Override
    public void displayCostArgs() {
        super.displayCostArgs();

        System.out.println("Nom de sortilège : " + name + "\n" + "Explications : " + explanation + "\n");

    }

}
