package lab3.gameComponents.gameSetup;

import lab3.droidTypes.DroidType;
import lab3.droidTypes.droidSubtypes.*;

import java.util.Scanner;

public class InputHandler {
    Scanner scanner = new Scanner(System.in);

    public String getBattleMode() {
        System.out.println("Choose battle mode:");
        System.out.println("\ta) 1v1");
        System.out.println("\tb) 5v5");
        String battleMode;
        do {
            System.out.print("Choice: ");
            battleMode = scanner.nextLine();
        } while (!battleMode.equals("a") & !battleMode.equals("b"));

        return battleMode;
    }

    public String getDroidChoice() {
        System.out.println("Select a droid:");
        System.out.println("\ta) Combat Droid");
        System.out.println("\tb) Defender Droid");
        System.out.println("\tc) Support Droid");

        String droidChoice;
        do {
            System.out.print("Choice: ");
            droidChoice = scanner.nextLine();
        } while (!droidChoice.equals("a") & !droidChoice.equals("b") & !droidChoice.equals("c"));

        return droidChoice;
    }

    public String getDroneSpec(String droidChoice) {
        System.out.println("Select droid specialization:");
        switch (droidChoice) {
            case "a":
                System.out.println("\ta) Stormtrooper: general purpose attack unit");
                System.out.println("\tb) Suicide Bomber: high damage, low health");
                break;
            case "b":
                System.out.println("\ta) Armored: high health, low damage, able to reduce incoming damage");
                System.out.println("\tb) Guardian: high health, low damage, able to grant shields");
                break;
            case "c":
                System.out.println("\ta) Repair: heals allies");
                System.out.println("\tb) Enhancer: increases damage");
                break;
        }

        String droidSpec;
        do {
            System.out.print("Choice: ");
            droidSpec = scanner.nextLine();
        } while (!droidSpec.equals("a") & !droidSpec.equals("b"));

        return droidSpec;
    }

    public DroidClass getDroidClass(String droidType, String droidSpec) {
        String droidCode = droidType + droidSpec;
        return switch (droidCode) {
            case "aa" -> new DroidClass(DroidType.COMBAT, CombatDroidSubtype.STORMTROOPER);
            case "ab" -> new DroidClass(DroidType.COMBAT, CombatDroidSubtype.SUICIDE_BOMBER);
            case "ba" -> new DroidClass(DroidType.DEFENDER, DefenderDroidSubtype.ARMORED);
            case "bb" -> new DroidClass(DroidType.DEFENDER, DefenderDroidSubtype.GUARDIAN);
            case "ca" -> new DroidClass(DroidType.SUPPORT, SupportDroidSubtype.REPAIR);
            case "cb" -> new DroidClass(DroidType.SUPPORT, SupportDroidSubtype.ENHANCER);
            default -> throw new IllegalArgumentException("Invalid droidType: " + droidType);
        };
    }
}
