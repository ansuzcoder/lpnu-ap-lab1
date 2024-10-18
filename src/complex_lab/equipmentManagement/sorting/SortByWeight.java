package complex_lab.equipmentManagement.sorting;

import complex_lab.armory.Equipment;
import complex_lab.equipmentManagement.strategies.SortStrategy;

import java.util.Comparator;
import java.util.List;

public class SortByWeight implements SortStrategy {
    @Override
    public void sort(List<Equipment> equipment) {
        equipment.sort(Comparator.comparing(Equipment::getWeight));
    }
}
