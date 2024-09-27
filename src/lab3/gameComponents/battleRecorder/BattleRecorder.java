package lab3.gameComponents.battleRecorder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BattleRecorder {
    public void recordBattle(List<String> droidTurns) {
        try {
            FileWriter fileWriter = new FileWriter("BattleRecord.txt");
            for (String droidTurn : droidTurns) {
                fileWriter.write(droidTurn + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while recording battle.");
        }
    }
}
