package racingcar.domain;

import racingcar.constant.Message;

public class Round {

    private final int round;

    public Round(String input) {
        int round;
        try {
            round = Integer.parseInt(input);
            if(round < 0) throw new IllegalArgumentException(Message.ERR_MOVECNT_FORMAT);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(Message.ERR_MOVECNT_FORMAT);
        }
        this.round = round;
    }

    public int getRound() {
        return round;
    }
}
