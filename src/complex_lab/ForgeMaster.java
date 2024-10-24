package complex_lab;

import complex_lab.equipment.Equipment;

import java.util.List;

public class ForgeMaster {
    private final List<Equipment> availableEquipment;
    private final Knight knight = new Knight();

    private double totalPrice = 0;

    public ForgeMaster(List<Equipment> equipment) {
        this.availableEquipment = equipment;
    }

    public void addEquipment(Equipment newEquipmentPiece) {
        this.knight.addEquipment(newEquipmentPiece);
    }

    public void customizeKnight(OptionProvider op) {
        String knightTypeFromUser = op.handleUserInput(List.of("a", "b", "c", "d", "e"));
        knight.setKnightType(knightTypeFromUser);

        boolean customizationProcessActive = true;
        while (customizationProcessActive) {
            System.out.println("Choose an option for your knight:");
            System.out.println("\ta) Add equipment");
            System.out.println("\tb) Remove equipment");
            System.out.println("\tc) Choose an option for your knight:");
        }
    }

    public Knight createKnight() {return this.knight;}

    public void recalculateTotalPrice() {
        double newTotalPrice = 0;
        for (Equipment equipPiece : knight.getKnightEquipment()) {
            newTotalPrice += equipPiece.getPrice();
        }
        this.totalPrice = newTotalPrice;
    }

    public double getFinalPrice() {return this.totalPrice;}
}