package lesson3;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        System.out.println("Input number and power : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < power; i++) {
            // same as
            // result = result * number;
            result *= number;
        }
        System.out.println("Result = " + result);
    }
}
