package lesson2;

import java.util.Scanner;

public class BiggestNumberOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 number
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        // 2 number
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        // 3 number
        System.out.print("Enter third number: ");
        int thirdNumber = sc.nextInt();

        boolean firstIsHighestNumber =
                (firstNumber >= secondNumber) && (firstNumber >= thirdNumber);
        if (firstIsHighestNumber) {
            System.out.println("Biggest number: " + firstNumber);
        }

        boolean secondIsHighestNumber =
                (secondNumber >= firstNumber) && (secondNumber >= thirdNumber);
        if (secondIsHighestNumber) {
            System.out.println("Biggest number: " + secondNumber);
        }

        boolean thirdIsHighestNumber =
                (thirdNumber >= secondNumber) && (thirdNumber >= firstNumber);
        if (thirdIsHighestNumber) {
            System.out.println("Biggest number: " + thirdNumber);
        }

    }

}
