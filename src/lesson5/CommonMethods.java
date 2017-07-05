package lesson5;

import java.util.Scanner;

public class CommonMethods {

    public static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextInt();
    }

    public static int findMaxNumber(int x1, int x2) {
        return x1 > x2 ? x1 : x2;
    }

    public static int findMaxNumber(int x1, int x2, int x3) {
        int maxNumber = findMaxNumber(x1, x2);
        return findMaxNumber(maxNumber, x3);
    }

    public static void printMessageToConsole(String message) {
        System.out.println(message);
    }

}
