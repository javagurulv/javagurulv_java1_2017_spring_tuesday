package lesson3;

import java.util.Scanner;

public class WhileEnterY {

    public static final String ANSWER_TO_CLOSE = "Y";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("To close program enter Y : ");
            answer = scanner.nextLine();
        } while (!answer.equalsIgnoreCase(ANSWER_TO_CLOSE));
        System.out.println("Bye!");
    }

}
