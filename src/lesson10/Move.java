package lesson10;

public class Move {

    private int x;
    private int y;
    private String sign;

    public Move(int x, int y, String sign) {
        this.x = x;
        this.y = y;
        this.sign = sign;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getSign() {
        return sign;
    }
}
