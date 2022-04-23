package racingcar.domain;

import org.junit.platform.commons.util.StringUtils;
import racingcar.constant.Message;

public class Car {

    public static final int INIT_POS = 0;
    private CarName name;
    private int position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = INIT_POS;
    }

    public CarName getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
