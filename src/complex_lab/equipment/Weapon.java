package complex_lab.equipment;

public class Weapon extends Equipment {
    private final String weaponSubtype;
    
    public Weapon(
        String pieceName,
        String weaponSubtype,
        String pieceAffiliation,
        double pieceWeight,
        double piecePrice
    ) {
        super(pieceName, pieceAffiliation, pieceWeight, piecePrice);
        this.weaponSubtype = weaponSubtype;
    }
    
    @Override
    public String getPieceType() {return "weapon";}
    public String getPieceSubtype() {return this.weaponSubtype;}

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
