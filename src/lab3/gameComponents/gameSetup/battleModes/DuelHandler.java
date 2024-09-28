package lab3.gameComponents.gameSetup.battleModes;

import lab3.droids.Droid;
import lab3.gameComponents.gameSetup.DroidClass;
import lab3.gameComponents.gameSetup.DroidGenerator;
import lab3.gameComponents.gameSetup.InputHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DuelHandler implements BattleHandler {
    File duelRecord = new File("./src/lab3/records/DuelRecord.txt");
    FileOutputStream fos = new FileOutputStream(duelRecord);
    PrintStream console = System.out;
    PrintStream ps = new PrintStream(fos);

    InputHandler inputHandler = new InputHandler();
    DroidGenerator droidGenerator = new DroidGenerator();

    Droid droidA;
    Droid droidB;

    public DuelHandler() throws FileNotFoundException {
    }

    @Override
    public void setUpBattle() {
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

    @Override
    public void runBattle() {
        System.setOut(ps);
        System.out.println("Battle Starts!");
        System.out.println("Combatant 1: [" + droidA.toString() + "]");
        System.out.println("Combatant 2: [" + droidB.toString() + "]");
        System.out.println();
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

    @Override
    public void displayDroids() {
        System.setOut(console);
        System.out.println("Requested: [DROID DISPLAY]. Status: [GRANTED]");
        System.out.println("Combatant 1: [" + droidA.toString() + "]");
        System.out.println("Combatant 2: [" + droidB.toString() + "]");
    }

    @Override
    public void replayBattle() {
        System.setOut(console);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(duelRecord));
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
