package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class OutputView {

    public static void showCarsPath(Cars cars) {
        for (Car car : cars.getCarList()) {
            System.out.println(car.getName() + " : " + car.getPath());
        }
        System.out.println();
    }
}
