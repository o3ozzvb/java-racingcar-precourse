package racingcar.view;

import racingcar.constant.Message;
import  camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputCarNames() {
        System.out.println(Message.MSG_INPUT_CAR_NAMES);
        return Console.readLine();
    }
}