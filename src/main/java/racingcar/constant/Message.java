package racingcar.constant;

public class Message {

    /**
     * Error Message
     */
    public static final String ERR_PREFIX = "[ERROR] ";
    public static final String ERR_NAME_LEN = ERR_PREFIX + "자동차 이름은 5글자 이내여야 합니다.";
    public static final String ERR_MOVECNT_FORMAT = ERR_PREFIX + "0 이상의 정수를 입력해주세요.";

    /**
     * Input Message
     */
    public static final String MSG_INPUT_CAR_NAMES = "경주할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";
    public static final String MSG_INPUT_MOVE_COUNT = "시도할 회수";
}
