package complex_lab.equipment;

public class Armor extends Equipment {
    private final String armorSubtype;
    
    public Armor(
        String pieceName,
        String armorSubtype,
        String pieceAffiliation,
        double pieceWeight,
        double piecePrice
    ) {
        super(pieceName, pieceAffiliation, pieceWeight, piecePrice);
        this.armorSubtype = armorSubtype;
    }
    
    @Override
    public String getPieceType() {return "armor";}
    public String getPieceSubtype() {return this.armorSubtype;}

    @Override
    public String toString() {
        return "<" +
                this.getPieceName() +
                " | type: [" +
                this.getPieceType() +
                "], subtype: [" +
                this.getPieceSubtype() +
                "], affiliation: [" +
                this.getPieceAffiliation() +
                "], weight: [" +
                this.getPieceWeight() +
                "], price: [" +
                this.getPiecePrice() +
                "]";
    }
}
