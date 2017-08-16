package lesson11;

public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            //m1();
            m2();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private static void m1() {
        throw new NullPointerException();
    }

    private static void m2() {
        throw new IllegalArgumentException();
    }

}
