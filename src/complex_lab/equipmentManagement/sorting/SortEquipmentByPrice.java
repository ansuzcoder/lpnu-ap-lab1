package complex_lab.equipmentManagement.sorting;

import complex_lab.armory.Equipment;
import complex_lab.equipmentManagement.strategies.SortStrategy;

import java.util.List;

public class SortEquipmentByPrice implements SortEquipment {
    private SortStrategy sortStrategy;

    public SortEquipmentByPrice(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    @Override
    public void sort(List<Equipment> equipment) {
        sortStrategy.sort(equipment);
        System.out.println("Sorted by price.");
    }
}