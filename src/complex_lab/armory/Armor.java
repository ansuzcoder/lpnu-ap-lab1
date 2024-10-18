package complex_lab.armory;

public class Armor implements Equipment {
    private String pieceName;
    private double piecePrice;
    private double pieceWeight;

    public Armor(String name, double price, double weight) {
        this.pieceName = name;
        this.piecePrice = price;
        this.pieceWeight = weight;
    }

    @Override
    public double getPrice() {
        return piecePrice;
    }

    @Override
    public double getWeight() {
        return pieceWeight;
    }

    @Override
    public String getType() {
        return "Armor";
    }

    public String getPieceDescription() {
        return "Armor: " + pieceName;
    }
}

