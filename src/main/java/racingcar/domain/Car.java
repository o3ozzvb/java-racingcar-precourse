package racingcar.domain;

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

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            this.position += 1;
        }
    }
}
