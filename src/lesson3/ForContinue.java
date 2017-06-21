package lesson3;

import java.util.Scanner;

public class ForContinue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " Please, input positive number : ");
            int number = scanner.nextInt();
            if (number < 1){
                // must be decremented
                // because i++ in for always works
                i--;
                continue;
            }
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }

}
