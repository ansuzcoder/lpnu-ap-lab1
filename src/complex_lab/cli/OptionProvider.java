package complex_lab.cli;

import java.util.List;
import java.util.Scanner;

public class OptionProvider {
    private final Scanner sc;

    private List<String> availableOptions;

    public OptionProvider(Scanner scanner) {
        this.sc = scanner;
    }

    public void displayStartMenuOptions() {
        System.out.println("Choose your option:");
        System.out.println("\t> a: create a knight...");
        System.out.println("\t> b: view equipment catalogue...");
        System.out.println("\t> q: quit forge...");

        availableOptions = List.of("a", "b", "q");
    }

    public void displayKnightCreationOptions() {
        System.out.println("Choose your option:");
        System.out.println("\t> a: add equipment to your knight...");
        System.out.println("\t> b: remove equipment from your knight...");
        System.out.println("\t> c: finish customizing and calculate total equipment price...");

        availableOptions = List.of("a", "b", "c");
    }

    public void displayAvailableKnightTypes() {
        System.out.println("Choose your knight's affiliation:");
        System.out.println("\t> a: Templars");
        System.out.println("\t> b: Night's Watch");
        System.out.println("\t> c: Kingsguard");
        System.out.println("\t> d: Blades");
        System.out.println("\t> e: The Grey Wardens");

        availableOptions = List.of("a", "b", "c", "d", "e");
    }

    public void displayCatalogueOptions() {
        System.out.println("Choose your option:");
        System.out.println("\t> a: sort items...");
        System.out.println("\t> b: find an item...");

        availableOptions = List.of("a", "b");
    }

    public void displayFindOptions() {
        System.out.println("Choose your option:");
        System.out.println("\t> a: find an item by price...");
        System.out.println("\t> b: find an item by weight...");
        System.out.println("\t> c: find an item by name...");

        availableOptions = List.of("a", "b", "c");
    }

    public void displaySortOptions() {
        System.out.println("Choose your option:");
        System.out.println("\t> a: sort items by price...");
        System.out.println("\t> b: sort items by weight...");
        System.out.println("\t> c: sort items by name...");

        availableOptions = List.of("a", "b", "c");
    }

    public String getUserChoice() {
        String userChoice = sc.nextLine();
        while (!availableOptions.contains(userChoice)) {
            userChoice = sc.nextLine();
        }
        return userChoice;
    }

    public double getPriceFromUser() {
        double requestedPrice = sc.nextDouble();
        while (requestedPrice < 0 || requestedPrice > 500) {
            requestedPrice = sc.nextDouble();            
        }
        return requestedPrice;
    }
    public double getWeightFromUser() {
        double requestedWeight = sc.nextDouble();
        while (requestedWeight < 0 || requestedWeight > 50) {
            requestedWeight = sc.nextDouble();            
        }
        return requestedWeight;
    }
    public String getNameFromUser() {return sc.nextLine();}
}
