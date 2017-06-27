package lesson4;

import java.util.Random;

/**
 * Created by olegssedacs on 27/06/2017.
 */
public class FillArray {

    public static final int SIZE = 10;

    public static void main(String[] args) {

        int[] array = new int[SIZE];
        fillArrayWithRandomNumbers(array, 100);
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public static void fillArrayWithRandomNumbers(int[]a, int range){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(range);
        }
    }

}
