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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TeamBattleHandler implements BattleHandler {
    private static final Random rand = new Random();

    File teamBattleRecord = new File("./src/lab3/records/TeamBattleRecord.txt");
    FileOutputStream fos = new FileOutputStream(teamBattleRecord);

    PrintStream console = System.out;
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

    @Override
    public void setUpBattle() {
        setUpTeam("A");
        setUpTeam("B");
    }

    public void runBattle() {
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

    @Override
    public void displayDroids() {
        System.setOut(console);
        System.out.println("Requested: [DROID DISPLAY]. Status: [GRANTED]");
        System.out.println("Team 1");
        for (Droid droid : droidTeamA) {
            System.out.println(droid.toString());
        }
        System.out.println();
        System.out.println("Team 2");
        for (Droid droid : droidTeamB) {
            System.out.println(droid.toString());
        }
    }

    @Override
    public void replayBattle() {
        System.setOut(console);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(teamBattleRecord));
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
