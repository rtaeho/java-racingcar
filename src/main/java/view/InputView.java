package view;

import domain.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String REQUEST_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String REQUEST_ATTEMPT_NUMBER = "시도할 회수는 몇회인가요?";

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Car> getCarNames() throws IOException {
        System.out.println(REQUEST_CAR_NAME);
        String name = br.readLine();
        String[] carNamesArray = name.split(",");
        List<Car> cars = new ArrayList<>();
        for (String carName : carNamesArray) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public static int getTryCount() throws IOException {
        System.out.println(REQUEST_ATTEMPT_NUMBER);
        return Integer.parseInt(br.readLine());
    }

}