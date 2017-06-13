package lesson2;

public class ForExample {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }

        int i = 0;
        for (;i < 1000;) {
            System.out.println(i);
            i = i + 1; // i++;   // ++i;
        }

    }


}
