package lesson9;

public class BookApp {

    public static void main(String[] args) {
        Book b = new Book("A", "B");
        System.out.println(b);

        Book b1 = new Book("A", "B");
        Book b2 = new Book("A", "B");

        System.out.println("Equals = " + b1.equals(b2));
        System.out.println("Links = " + (b1 == b2));


    }

}
