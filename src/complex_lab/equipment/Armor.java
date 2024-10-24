package complex_lab.equipment;

public class Armor implements Equipment {
    private final String pieceName;
    private final double pieceWeight;
    private final double piecePrice;
    private final String affiliatedWith;

    public Armor(String name, double weight, double price, String affiliation) {
        this.pieceName = name;
        this.pieceWeight = weight;
        this.piecePrice = price;
        this.affiliatedWith = affiliation;
    }

    public String getPieceName() {return this.pieceName;}

    @Override
    public double getPrice() {return this.piecePrice;}

    @Override
    public double getWeight() {return this.pieceWeight;}

    @Override
    public String getType() {return "weapon";}

    public String getAffiliation() {return this.affiliatedWith;}

    @Override
    public String toString() {
        return getType() + " <" + getPieceName() + "> | Weight: [" +getPrice() + "], Price: [" + getPrice() + "]";
    }
}
