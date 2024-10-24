package complex_lab;

import complex_lab.equipment.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Knight {
    public final String knightName;
    private String knightType;
    private final List<Equipment> knightEquipment = new ArrayList<>();

    public Knight() {
        this.knightName = "Sir Abbadon";
        this.knightType = "Templars";
    }

    public Knight(String name, String type) {
        this.knightName = name;
        this.knightType = type;
    }

    public void setKnightType(String newType) {this.knightType = newType;}

    public void addEquipment(Equipment equipmentPiece) {
        knightEquipment.add(equipmentPiece);
    }

    public void removeEquipment(Equipment equipmentPiece) {
        knightEquipment.remove(equipmentPiece);
    }

    public List<Equipment> getKnightEquipment() {return this.knightEquipment;}
}