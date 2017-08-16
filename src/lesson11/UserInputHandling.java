package lesson11;

import java.util.Scanner;

public class UserInputHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = getNumberFromUser(sc);
        System.out.println("User number = " + number);
    }

    private static int getNumberFromUser(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter number: ");
                String str = sc.nextLine();
                return Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Use only numbers please!");
            }
        }
    }

}
