package complex_lab.forgery;

import java.util.ArrayList;
import java.util.List;
import complex_lab.equipment.Equipment;

public class Knight {
    private List<Equipment> eq;
    private final String knightAffiliation;

    public Knight(String knightAffiliation) {
        eq = new ArrayList<>();
        this.knightAffiliation = knightAffiliation;
    }

    public String getAffiliation() {return this.knightAffiliation;}
    public List<Equipment> getCurrEquipment() {return this.eq;}
    
    public void setNewEquipment(List<Equipment> newEq) {this.eq = newEq;}
}
