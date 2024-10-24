import complex_lab.ForgeMaster;
import complex_lab.Knight;
import complex_lab.OptionProvider;
import complex_lab.equipment.Equipment;
import complex_lab.forge_init.ForgeInitializer;

import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<Equipment> availableEquipment = new ForgeInitializer().initializeForgery();
        ForgeMaster fm = new ForgeMaster(availableEquipment);

        Scanner scanner = new Scanner(System.in);
        OptionProvider optionProvider = new OptionProvider(availableEquipment, scanner);

        System.out.println("Welcome to the Forgery!");
        System.out.println("Here you can create your own very knight.");
        System.out.println("Feel free to experiment.\n");

        optionProvider.displayStartMenu();
        List<String> startMenuOptions = List.of("a", "b");
        String startetMenuChoice = optionProvider.handleUserInput(startMenuOptions);

        switch (startetMenuChoice) {
        // start menu options
            case "a":
                optionProvider.displayKnightTypes();
                break;
            case "b":
                optionProvider.displayEquipment();
                break;
        }

        Knight knight = fm.createKnight();
    }
}