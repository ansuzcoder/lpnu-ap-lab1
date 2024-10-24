package complex_lab.forgery;

import java.util.ArrayList;
import java.util.List;

import complex_lab.equipment.Armor;
import complex_lab.equipment.Equipment;
import complex_lab.equipment.Weapon;

public class ForgeryInit {
    public List<Equipment> generateAvailableEquipment() {
        List<Equipment> eq = new ArrayList<>();

        eq.add(new Weapon("Akaviri katana", "One-handed", "Blades", 10, 300));
        eq.add(new Weapon("Akaviri daikatana", "Two-handed", "Blades", 15, 350));
        eq.add(new Weapon("Akaviri tachi", "One-handed", "Blades", 5, 120));
        eq.add(new Weapon("Akaviri longbow", "Ranged", "Blades", 8, 240));
        
        eq.add(new Armor("Akaviri leather helmet", "Light headwear", "Blades", 16, 300));
        eq.add(new Armor("Akaviri leather cuirass", "Light cuirass", "Blades", 25, 350));
        eq.add(new Armor("Akaviri leather gloves", "Light handwear", "Blades", 6, 280));
        eq.add(new Armor("Akaviri leather pantalons", "Light legwear", "Blades", 8, 330));
        eq.add(new Armor("Akaviri leather boots", "Light boots", "Blades", 8, 320));

        return eq;
    }
}
