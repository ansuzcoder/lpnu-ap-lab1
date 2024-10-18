import complex_lab.ForgeMaster;
import complex_lab.armory.Armor;
import complex_lab.armory.Equipment;
import complex_lab.armory.Weapon;
import complex_lab.equipmentManagement.sorting.SortByPrice;
import complex_lab.equipmentManagement.sorting.SortEquipment;
import complex_lab.equipmentManagement.sorting.SortEquipmentByPrice;
import complex_lab.equipmentManagement.strategies.SortStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList.add(new Armor("Chestplate", 300, 20));
        equipmentList.add(new Armor("Helmet", 100, 5));
        equipmentList.add(new Weapon("Sword", 200, 10));

        ForgeMaster forgemaster = new ForgeMaster(equipmentList);

        SortStrategy priceStrategy = new SortByPrice();
        SortEquipment sortByPrice = new SortEquipmentByPrice(priceStrategy);

        forgemaster.sortEquipment(sortByPrice);

        System.out.println("Welcome to Forgery! Here you can create and equip your own very knight!");

        String userChoice;
        boolean quit = false;
        while (!quit) {
            System.out.println("Select your option:");
            System.out.println("\ta) equip knight");
            System.out.println("\tb) unequip knight");
            System.out.println("\tc) display catalogue");
            System.out.println("\td) calculate total price:");
            System.out.println("\tq) exit armory");
            userChoice = scanner.nextLine();

            switch (userChoice) {
                case "a":
                    System.out.println("You've selected to equip your knight");
                    System.out.println("Functionality underway...");
                    break;
                case "b":
                    System.out.println("You've selected to unequip your knight");
                    System.out.println("Functionality underway...");
                    break;
                case "c":
                    System.out.println("You've selected display armory catalogue");
                    System.out.println("Functionality underway...");
                    break;
                case "d":
                    double totalEquipmentValue = forgemaster.calculateTotalPrice();
                    System.out.println("Your knight's equipment total price is: " + totalEquipmentValue);
                    break;
                case "q":
                    System.out.println("Thanks for using Forgery! See you next time!");
                    quit = true;
                    break;
            }
        }
    }
}