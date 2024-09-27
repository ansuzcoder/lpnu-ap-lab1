package lab3.gameComponents.gameSetup.battleModes;

import lab3.droids.Droid;
import lab3.gameComponents.gameSetup.DroidClass;
import lab3.gameComponents.gameSetup.DroidGenerator;
import lab3.gameComponents.gameSetup.InputHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TeamBattleHandler {
    private static final Random rand = new Random();

    File duelRecord = new File("TeamBattleRecord.txt");
    FileOutputStream fos = new FileOutputStream(duelRecord);
    PrintStream ps = new PrintStream(fos);

    InputHandler inputHandler = new InputHandler();
    DroidGenerator droidGenerator = new DroidGenerator();

    List<Droid> droidTeamA = new ArrayList<>();
    List<Droid> droidTeamB = new ArrayList<>();

    public TeamBattleHandler() throws FileNotFoundException {}

    public boolean teamEliminated(List<Droid> droidTeam) {
        for (Droid droid : droidTeam) {
            if (droid.isIntact()) {
                return false;
            }
        }
        return true;
    }

    public void setUpTeam(String teamName) {
        System.out.println("Assembling Team-" + teamName.toUpperCase() + " for battle...");
        for (int i = 0; i < 5; i++) {
            String droidType = inputHandler.getDroidChoice();
            String droidSubtype = inputHandler.getDroneSpec(droidType);
            DroidClass droidClass = inputHandler.getDroidClass(droidType, droidSubtype);


            Droid newDroid = droidGenerator.createDroid(droidClass.getDroidType(), droidClass.getDroidSubtype());
            switch (teamName) {
                case "a":
                    droidTeamA.add(newDroid);
                    break;
                case "b":
                    droidTeamB.add(newDroid);
                    break;
            }
        }
    }

    public void runTeamBattle() {
        List<Droid> combinedDroids = new ArrayList<>(droidTeamA);
        combinedDroids.addAll(droidTeamA);
        combinedDroids.addAll(droidTeamB);

        List<Droid> droidBattleOrder = new ArrayList<>(droidTeamA);
        Collections.shuffle(combinedDroids);

        System.setOut(ps);
        while (true) {
            if (teamEliminated(droidTeamA)) {
                System.out.println("Team-A Eliminated. Interrupting battle.");
                break;
            }

            if (teamEliminated(droidTeamB)) {
                System.out.println("Team-B Eliminated. Interrupting battle.");
                break;
            }

            for (Droid droid : droidBattleOrder) {
                // double skillChance = rand.nextDouble();
                if (droidTeamA.contains(droid)) {
                    int randomTarget = rand.nextInt(droidTeamB.size());
                    droid.attackEnemy(droidTeamB.get(randomTarget));
                } else {
                    int randomTarget = rand.nextInt(droidTeamA.size());
                    droid.attackEnemy(droidTeamA.get(randomTarget));
                }
            }
            System.out.println();
        }
    }
}
