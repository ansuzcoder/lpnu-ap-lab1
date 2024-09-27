import lab3.gameComponents.gameSetup.InputHandler;
import lab3.gameComponents.gameSetup.battleModes.DuelHandler;
import lab3.gameComponents.gameSetup.battleModes.TeamBattleHandler;

import java.io.FileNotFoundException;

class   Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputHandler inputHandler = new InputHandler();
        String battleMode = inputHandler.getBattleMode();

        switch (battleMode) {
            case "a":
                DuelHandler duelHandler = new DuelHandler();
                duelHandler.setUpDuel();
                duelHandler.runDuel();

                System.setOut(System.out);
                System.out.println("The Battle has been recorded to DuelRecord.txt");
                break;
            case "b":
                TeamBattleHandler teamBattleHandler = new TeamBattleHandler();
                teamBattleHandler.setUpTeam("a");
                teamBattleHandler.setUpTeam("b");
                teamBattleHandler.runTeamBattle();

                System.setOut(System.out);
                System.out.println("The Battle has been recorded to TeamBattleRecord.txt");
                break;
        }
    }
}