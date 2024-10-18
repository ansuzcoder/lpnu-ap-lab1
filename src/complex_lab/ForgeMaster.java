package complex_lab;

import complex_lab.armory.Equipment;
import complex_lab.equipmentManagement.sorting.SortEquipment;

import java.util.List;

public class ForgeMaster {
    private List<Equipment> equipmentList;

    public ForgeMaster(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

//    public void findEquipment(FindEquipment findCommand) {
//        List<Equipment> foundEquipment = findCommand.find();
//        foundEquipment.forEach(equipment -> System.out.println(equipment.getType() + ": " + equipment.getPrice()));
//    }

    public void sortEquipment(SortEquipment sortCommand) {
        sortCommand.sort(equipmentList);
        equipmentList.forEach(equipment -> System.out.println(equipment.getType() + ": " + equipment.getPrice()));
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Equipment equipment : equipmentList) {
            totalPrice += equipment.getPrice();
        }
        return totalPrice;
    }
}
