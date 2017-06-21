package lesson3;

import java.util.Scanner;

public class LoopContinue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 0;
        while (i < 3){
            System.out.println(i + 1 + " Please, input positive number : ");
            int number = scanner.nextInt();
            if (number < 1){
                continue;
            }
            sum += number;
            i++;
        }
        System.out.println("Sum = " + sum);
    }

}
