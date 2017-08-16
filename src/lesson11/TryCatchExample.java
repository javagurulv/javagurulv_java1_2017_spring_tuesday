package lesson11;

public class TryCatchExample {

    public static void main(String[] args) {
        try {
            throw new Exception("Error message");
        } catch (Exception e) {
            System.out.println("Error message = " + e.getMessage());
            e.printStackTrace();
        }
    }

}
