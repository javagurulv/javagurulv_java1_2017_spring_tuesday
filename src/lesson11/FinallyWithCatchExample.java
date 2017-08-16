package lesson11;

public class FinallyWithCatchExample {

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Exception 1");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Good by :) ");
        }
    }

}
