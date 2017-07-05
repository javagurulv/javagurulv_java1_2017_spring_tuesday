package lesson5;

import java.util.Random;

public class CommonArrayMethods {

    public static int[] createArray(int length) {
        return new int[length];
    }

    public static void fillArrayWithRandomNumbers(int[] arr) {
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }
    }

    public static void printArrayToConsole(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int calculateSumOfArrayElements(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
