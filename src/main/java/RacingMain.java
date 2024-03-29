import view.InputView;
import view.ResultView;
import domain.RacingGame;

import java.io.IOException;

public class RacingMain {
    public static void main(final String... args) throws IOException {
        final var carNames = InputView.getCarNames();
        final var tryCount = InputView.getTryCount();
        final RacingGame racingGame = new RacingGame(carNames, tryCount);
        racingGame.race();
        ResultView.printWinners(racingGame.getWinners());
    }
}
