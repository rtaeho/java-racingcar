package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = addCars(carNames);
    }

    public List<Car> addCars(String carNames) {
        String[] carNamesArray = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String carName : carNamesArray) {
            cars.add(new Car(carName.trim()));
        }
        return cars;
    }

    public void moveAllCars() {
        for (Car car : cars) {
            car.move(generateRandomNumber());
        }
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 10);
    }

    public int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            int carPosition = car.getPosition();
            if (carPosition > maxPosition) {
                maxPosition = carPosition;
            }
        }
        return maxPosition;
    }


    public List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            int carPosition = car.getPosition();
            int maxPosition = findMaxPosition();
            if (carPosition == maxPosition) {
                winners.add(car.getCarName());
            }
        }
        return winners;
    }

    public List<Car> getCars() {
        return cars;
    }
}