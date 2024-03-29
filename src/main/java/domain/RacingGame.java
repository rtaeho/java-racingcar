package domain;

import view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> carNames;
    private int tryCount;

    public RacingGame(List<Car> carNames, int tryCount) {
        this.carNames = carNames;
        this.tryCount = tryCount;
    }

    public int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : carNames) {
            int carPosition = car.getPosition();
            if (carPosition > maxPosition) {
                maxPosition = carPosition;
            }
        }
        return maxPosition;
    }

    public List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        for (Car car : carNames) {
            int carPosition = car.getPosition();
            int maxPosition = findMaxPosition();
            if (carPosition == maxPosition) {
                winners.add(car.getCarName());
            }
        }
        return winners;
    }

    public void race() {
        for (int i = 0; i < tryCount; i++) {
            for (Car car : carNames) {
                int randomNum = (int) (Math.random() * 10);
                car.move(randomNum);
            }
            ResultView.printStatus(carNames);
        }
    }
}
