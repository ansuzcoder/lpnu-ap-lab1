import lab3.gameComponents.gameSetup.InputHandler;
import lab3.gameComponents.gameSetup.battleModes.DuelHandler;

class   Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        String battleMode = inputHandler.getBattleMode();

        switch (battleMode) {
            case "a":
                DuelHandler duelHandler = new DuelHandler();
                duelHandler.setUpDuel();
                duelHandler.runDuel();
                break;
            case "b":
                System.out.println("No team battle released yet");
                break;
        }
    }
}