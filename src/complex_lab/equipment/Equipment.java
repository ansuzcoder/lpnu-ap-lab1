package complex_lab.equipment;

public class Equipment {
    private String pieceName;
    private String pieceAffiliation;
    private double pieceWeight;
    private double piecePrice;

    public Equipment(
        String pieceName,
        String pieceAffiliation,
        double pieceWeight,
        double piecePrice
    ) {
        this.pieceName = pieceName;
        this.pieceAffiliation = pieceAffiliation;
        this.pieceWeight = pieceWeight;
        this.piecePrice = piecePrice;
    }

    public String getPieceName() {return this.pieceName;}
    public String getPieceAffiliation() {return this.pieceAffiliation;}
    public double getPieceWeight() {return this.pieceWeight;}
    public double getPiecePrice() {return this.piecePrice;}
    public String getPieceType() {return "equipment";}

    public boolean equals(Equipment oeq) {
        return (this.pieceName).equals(oeq.getPieceName()) &&
               (this.pieceAffiliation).equals(oeq.getPieceAffiliation()) &&
               (this.piecePrice) == oeq.getPiecePrice() &&
               (this.pieceWeight) == oeq.getPieceWeight();
    }
}
