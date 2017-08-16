package lesson11;

public class TrowAndCatchExample {

    public static void main(String[] args) {
        try {
            m();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private static void m() {
        throw new NullPointerException();
    }

}
