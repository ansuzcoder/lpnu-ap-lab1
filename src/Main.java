import java.util.List;
import java.util.Scanner;

import complex_lab.cli.OptionHandler;
import complex_lab.cli.OptionProvider;
import complex_lab.equipment.Equipment;
import complex_lab.forgery.ForgeMaster;
import complex_lab.forgery.ForgeryInit;

public class Main {
    public static void displayEq(List<Equipment> eq) {
        System.out.println("Here's what we got...");
        for (Equipment eqp : eq) {
            System.out.println(eqp.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the forgery!");
        System.out.println("Here you can create your very own knight.");
        System.out.println("Feel free to experiment!");

        List<Equipment> eq = new ForgeryInit().generateAvailableEquipment();

        Scanner sc = new Scanner(System.in);
        ForgeMaster fm = new ForgeMaster(eq);
        OptionProvider op = new OptionProvider(sc);
        OptionHandler oh = new OptionHandler(fm, sc);

        boolean inForge = true;
        while (inForge) {
            op.displayStartMenuOptions();
            String startMenuChoice = op.getUserChoice();
    
            switch (startMenuChoice) {
                case "a":
                    op.displayKnightCreationOptions();
                    oh.handleKnightCreation();
                    break;
                case "b":
                    op.displayCatalogueOptions();
                    String catalogueUserChoice = op.getUserChoice();
                    List<Equipment> selectedEq = oh.handleCatalogueOption(catalogueUserChoice);
                    displayEq(selectedEq);
                    break;
                case "q":
                    System.out.println("Exiting forde... See you next time!");
                    inForge = false;
                    break;
            }
        }
    }    
}
