package complex_lab;

import complex_lab.equipment.Equipment;

import java.util.List;
import java.util.Scanner;

public class OptionProvider {
    private final List<Equipment> availableEquipment;
    public Scanner sc;

    public OptionProvider(List<Equipment> availableEquipment, Scanner sc) {
        this.availableEquipment = availableEquipment;
        this.sc = sc;
    }

    public void displayKnightTypes() {
        System.out.println("\ta) Templars");
        System.out.println("\tb) Night's Watch");
        System.out.println("\tc) Kingsguard");
        System.out.println("\td) Blades");
        System.out.println("\te) Grey Wardens");
    }

    public void displayEquipment() {
        for (Equipment equipment : availableEquipment) {
            System.out.println(equipment.toString());
        }
    }

    public void displayStartMenu() {
        System.out.println("Choose your option:");
        System.out.println("\ta) create a knight;");
        System.out.println("\tb) browse available equipment;");
    }

    public String handleUserInput(List<String> allowedOptions) {
        System.out.println("My choice: ");
        String userFirstChoice = sc.nextLine();

        while (!allowedOptions.contains(userFirstChoice)) {
                System.out.println("No such option available... Please, try again.");
                System.out.println("My choice: ");
                userFirstChoice = sc.nextLine();
            }

        return userFirstChoice;
    }
}
