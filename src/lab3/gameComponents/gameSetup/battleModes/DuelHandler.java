package lab3.gameComponents.gameSetup.battleModes;

import lab3.droids.Droid;
import lab3.gameComponents.gameSetup.DroidClass;
import lab3.gameComponents.gameSetup.DroidGenerator;
import lab3.gameComponents.gameSetup.InputHandler;

public class DuelHandler {
    InputHandler inputHandler = new InputHandler();
    DroidGenerator droidGenerator = new DroidGenerator();

    Droid droidA;
    Droid droidB;

    public void setUpDuel() {
        System.out.println("Assembling Droid-A for battle...");
        String droidAType = inputHandler.getDroidChoice();
        String droidASubtype = inputHandler.getDroneSpec(droidAType);
        DroidClass droidClassA = inputHandler.getDroidClass(droidAType, droidASubtype);

        System.out.println("Assembling Droid-B for battle...");
        String droidBType = inputHandler.getDroidChoice();
        String droidBSubtype = inputHandler.getDroneSpec(droidBType);
        DroidClass droidClassB = inputHandler.getDroidClass(droidBType, droidBSubtype);

        droidA = droidGenerator.createDroid(droidClassA.getDroidType(), droidClassA.getDroidSubtype());
        droidB = droidGenerator.createDroid(droidClassB.getDroidType(), droidClassB.getDroidSubtype());
    }

    public void runDuel() {
        System.out.println("Battle Starts!");
        System.out.println("Combatant 1: [" + droidA.toString() + "]");
        System.out.println("Combatant 2: [" + droidB.toString() + "]");
        while (true) {
            droidA.attackEnemy(droidB);
            if (!droidB.isIntact()) {
                break;
            }
            droidB.attackEnemy(droidA);
            if (!droidA.isIntact()) {
                break;
            }
            System.out.println("Droid A HP left: " + droidA.getDroidHp());
            System.out.println("Droid B HP left: " + droidB.getDroidHp());
            System.out.println();
        }
    }
}
