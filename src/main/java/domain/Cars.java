package domain;

import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> carNameList) {
        this.cars = carNameList;
    }

    public List<Car> getCars() {
        return cars;
    }
}