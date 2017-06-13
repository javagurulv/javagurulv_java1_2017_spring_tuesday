package lesson2;

import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }


}
