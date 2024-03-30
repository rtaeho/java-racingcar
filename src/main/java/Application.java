import controller.RacingGameManager;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        RacingGameManager racingGameManager = new RacingGameManager();
        racingGameManager.race();
    }
}