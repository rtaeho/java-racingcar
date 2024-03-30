package view;

import java.util.List;

import domain.Car;

public class ResultView {
    public void printStatus(List<Car> carsList) {
        for (Car car : carsList) {
            int currentPosition = car.getPosition();
            String carName = car.getCarName();
            System.out.print(carName + " : ");
            printPosition(currentPosition);
        }
        System.out.println();
    }

    private void printPosition(int currenPosition) {
        for (int i = 0; i < currenPosition; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        String result = String.join(", ", winners);
        System.out.println(result + "가 최종 우승했습니다.");
    }

}
