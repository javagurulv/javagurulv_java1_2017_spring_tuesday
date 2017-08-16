package lesson11;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("Exception 1");
        } finally {
            System.out.println("Good by :) ");
            throw new IllegalArgumentException("Exception 2");
        }
    }

}
