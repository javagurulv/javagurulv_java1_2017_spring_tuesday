package lesson2;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get first number from user
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        // get second number from user
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        // 1 compare
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }

        // 2 --------------------------------------
        boolean firstNumberBigger = firstNumber > secondNumber;
        if (firstNumberBigger) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }

    }

}
