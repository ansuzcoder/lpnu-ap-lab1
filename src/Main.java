import lab3.gameComponents.gameSetup.InputHandler;
import lab3.gameComponents.gameSetup.battleModes.*;

import java.io.FileNotFoundException;

class   Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputHandler inputHandler = new InputHandler();
        String battleMode = inputHandler.getBattleMode();
        String afterBattleChoice = inputHandler.getAfterBattleChoice();

        switch (battleMode) {
            case "a":
                DuelHandler duelHandler = new DuelHandler();
                duelHandler.setUpBattle();
                duelHandler.runBattle();
                inputHandler.handleAfterBattleOption(duelHandler, afterBattleChoice);
                break;
            case "b":
                TeamBattleHandler teamBattleHandler = new TeamBattleHandler();
                teamBattleHandler.setUpTeam("a");
                teamBattleHandler.setUpTeam("b");
                teamBattleHandler.runBattle();
                inputHandler.handleAfterBattleOption(teamBattleHandler, afterBattleChoice);
                break;
        }
    }
}