package controller;

import domain.Cars;
import view.InputView;
import view.ResultView;
import java.io.IOException;


public class RacingGameManager {
    private final InputView inputView = new InputView();
    private final ResultView resultView = new ResultView();

    public void race() throws IOException {
        String names = inputView.getCarNames();
        Cars cars = new Cars(names);

        int tryCount = inputView.getTryCount();
        runGame(tryCount, cars);

        resultView.printWinners(cars.getWinners());
    }

    void runGame(int tryCount, Cars cars) {
        for (int i = 0; i < tryCount; i++) {
            cars.moveAllCars();
            resultView.printStatus(cars.getCars());
        }

    }

}
