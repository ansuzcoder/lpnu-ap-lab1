package complex_lab.forge_init;

import complex_lab.equipment.Equipment;
import complex_lab.equipment.Weapon;

import java.util.ArrayList;
import java.util.List;

public class ForgeInitializer {
    private final List<Equipment> availableEquipment = new ArrayList<>();

    public List<Equipment> initializeForgery() {
        availableEquipment.add(new Weapon("Blades Sword", 10, 300, "Blades"));
        availableEquipment.add(new Weapon("Kingsguard Sword", 10.2, 350, "Kingsguard"));
        availableEquipment.add(new Weapon("Night Watch's Sword", 12.5, 150, "Night Watch"));
        availableEquipment.add(new Weapon("Warden's Sword", 20, 320, "Grey Wardens"));
        availableEquipment.add(new Weapon("Templar's Sword", 15, 200, "Templars"));

        return availableEquipment;
    }
}