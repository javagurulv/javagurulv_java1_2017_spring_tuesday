package lesson3;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
