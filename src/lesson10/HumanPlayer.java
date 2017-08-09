package lesson10;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private String sign;

    public HumanPlayer(String sign) {
        this.sign = sign;
    }

    @Override
    public Move getMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x:");
        int x = sc.nextInt();
        System.out.print("Enter y:");
        int y = sc.nextInt();

        return new Move(x, y, sign);
    }

}
