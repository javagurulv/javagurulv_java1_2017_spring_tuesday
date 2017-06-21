package lesson3;

import java.util.Scanner;

public class BreakLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Input number to add or blank to exit : ");
            String input = scanner.nextLine();
            if (!input.equals("")){
                break;
            }
            sum += Integer.parseInt(input);
        }
        System.out.println("Sum = " + sum);
    }


}
