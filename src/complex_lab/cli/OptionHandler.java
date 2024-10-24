package complex_lab.cli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import complex_lab.commands.finding.FindByPrice;
import complex_lab.commands.finding.FindByWeight;
import complex_lab.commands.sorting.SortByName;
import complex_lab.commands.sorting.SortByPrice;
import complex_lab.commands.sorting.SortByWeight;
import complex_lab.equipment.Equipment;
import complex_lab.forgery.ForgeMaster;

public class OptionHandler extends OptionProvider {
    private final ForgeMaster fm;   
    
    public OptionHandler(ForgeMaster fm, Scanner scanner) {
        super(scanner);
        this.fm = fm;
    }
    
    public List<Equipment> handleCatalogueOption(String userChoice) {
        List<Equipment> resultEq = new ArrayList<>();
        switch (userChoice) {
            // sort items
            case "a":
                this.displaySortOptions();
                String sortUserChoice = this.getUserChoice();
                switch (sortUserChoice) {
                    case "a":
                        fm.setSortCommand(new SortByPrice(fm.getAvailableEquipment()));
                        break;
                    case "b":
                        fm.setSortCommand(new SortByWeight(fm.getAvailableEquipment()));
                        break;
                    case "c":
                        fm.setSortCommand(new SortByName(fm.getAvailableEquipment()));
                        break;
                    default:
                        break;
                }
                resultEq = fm.executeSort();
                break;
            // find an item
            case "b":
                this.displayFindOptions();
                String findUserChoice = this.getUserChoice();
                switch (findUserChoice) {
                    case "a":
                        double requestedPrice = this.getPriceFromUser();
                        fm.setFindCommand(new FindByPrice(fm.getAvailableEquipment(), requestedPrice));
                        break;
                    case "b":
                        double requestedWeight = this.getWeightFromUser();
                        fm.setFindCommand(new FindByWeight(fm.getAvailableEquipment(), requestedWeight));
                        break;
                    case "c":
                        System.out.println("[... in progress...]");
                        break;
                }

                resultEq = fm.executeFind();
                break;
        }
        return resultEq;
    }

    public void handleKnightCreation() {
        this.displayAvailableKnightTypes();
        String knightType = this.getUserChoice();
        this.fm.createKnight(knightType);

        this.displayKnightCreationOptions();
        boolean customizationProcessActive = true;
        while (customizationProcessActive) {
            String userChoice = this.getUserChoice();
            switch (userChoice) {
                case "a":
                    System.out.println("... option <a> in progress ...");
                    break;
                case "b":
                    System.out.println("... option <b> in progress ...");
                    break;
                case "c":
                    customizationProcessActive = false;
                    System.out.println("Total equipment price: [" + this.fm.getTotalPrice() + "]");
                    break;
            }
        }
    }
}
