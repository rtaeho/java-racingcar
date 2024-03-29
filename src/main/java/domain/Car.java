package domain;

public class Car {
    private static final int STANDARD_NUM = 4;
    private final String carName;
    private int position;

    public Car(String carName) {
        this.carName = carName;
        this.position = 0;
    }

    public void move(int num) {
        if (num >= STANDARD_NUM) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }


    public String getCarName() {
        return carName;
    }
}
