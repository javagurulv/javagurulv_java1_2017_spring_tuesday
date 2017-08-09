package lesson10;

import java.util.Random;

public class ComputerPlayer implements Player {

    private String sign;

    public ComputerPlayer(String sign) {
        this.sign = sign;
    }

    @Override
    public Move getMove() {
        Random rnd = new Random();
        int x = rnd.nextInt(3);
        int y = rnd.nextInt(3);
        return new Move(x, y, sign);
    }

}
