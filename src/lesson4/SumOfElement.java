package lesson4;

import java.util.Random;

/**
 * Created by olegssedacs on 27/06/2017.
 */
public class SumOfElement {

    public static void main(String[] args) {
        int[] array = new int[2];
        fillWithRandom(array, 10);
        printArray(array);
        int sum = sumOfElement(array);
        System.out.println("Sum = " + sum);
    }

    // method has return type int
    // it must calculate sum of elements and give result
    public static int sumOfElement(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            //same as :
            // sum = sum + a[i];
        }
        return sum;
    }

    // void methods don't return any values
    // we don't need result of printing
    // this method should print array elements to console only
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Array[%d] = %d\n", i, a[i]);
        }
    }

    // in this method we don't result, it should fill array, that's all
    public static void fillWithRandom(int[]a, int range){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(range);
        }
    }
}
