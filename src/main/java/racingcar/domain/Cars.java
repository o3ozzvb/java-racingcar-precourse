package racingcar.domain;

import racingcar.constant.Message;

import java.util.*;

public class Cars {

    public static final int INIT_POS = 0;
    public static final String SEPARATOR = ",";

    private List<Car> carList;

    public Cars(String names) {
        this.carList = createCarList(names);
    }

    public List<Car> createCarList(String names) {
        List<Car> carList = new ArrayList<>();

        for(String name : names.split(SEPARATOR)) {
            carList.add(new Car(name));
        }

        return carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

}
