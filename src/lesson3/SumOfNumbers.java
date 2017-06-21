package lesson3;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
//            int b = number % 10;
//            sum = sum + b;
//            number = number / 10;
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum = " + sum);
    }
}
