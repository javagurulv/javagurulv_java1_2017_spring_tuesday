package lesson4;

import java.util.Scanner;

/**
 * Created by olegssedacs on 27/06/2017.
 */
public class MethodsSum {

    public static final int SOME_CONST = 100;

    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 3;
        int sum = sum(firstNumber, secondNumber);
        System.out.println("sum = " + sum);
        int pow = power(firstNumber, 3);
        System.out.println("power = " + pow);

        System.out.println(power(2, 10));

        int fromUser = getNumberFromUser("Input number : ");
        System.out.println("Cool!!!");
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
        //same as
        // boolean result = number % 2 == 0;
        // return result;
    }

    public static boolean isOdd(int number){
        return !isEven(number);
    }

    public static int getNumberFromUser(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int power(int number, int pow){
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= number;
        }
        return result;
    }

    public static int sum(int a, int b){
        return a + b;
    }


}
