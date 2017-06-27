package lesson4;

import java.util.Scanner;

/**
 * Created by olegssedacs on 27/06/2017.
 */
public class FirstArray {

    public static final int SIZE = 4;

    public static void main(String[] args) {
        // fill manually
        int[] numbers = new int[SIZE];
        numbers[0] = 84;
        numbers[1] = 32;
        numbers[2] = 51;
        numbers[3] = 99;

        // fill from console
        int[] array = new int[SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int sequenceNumber = i + 1;
            System.out.print(sequenceNumber  + ". Input number : ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }

}
