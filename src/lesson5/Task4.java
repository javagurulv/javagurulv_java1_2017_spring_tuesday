package lesson5;

public class Task4 {

    public static void main(String[] args) {
        int[] array = CommonArrayMethods.createArray(10);
        CommonArrayMethods.fillArrayWithRandomNumbers(array);
        CommonArrayMethods.printArrayToConsole(array);
        int elementSum = CommonArrayMethods.calculateSumOfArrayElements(array);
        CommonMethods.printMessageToConsole("Array Element Sum = " + elementSum);
    }



}
