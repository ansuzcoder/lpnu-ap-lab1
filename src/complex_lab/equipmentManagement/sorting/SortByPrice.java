package complex_lab.equipmentManagement.sorting;

import complex_lab.armory.Equipment;
import complex_lab.equipmentManagement.strategies.SortStrategy;

import java.util.Comparator;
import java.util.List;

public class SortByPrice implements SortStrategy {
    @Override
    public void sort(List<Equipment> equipment) {
        equipment.sort(Comparator.comparingDouble(Equipment::getPrice));
    }
}
