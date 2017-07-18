package lesson7;

import java.util.Scanner;

public class CarApplication {

    public static void main(String[] args) {
        InMemoryCarCatalog carCatalog = new InMemoryCarCatalog();

        Menu menu = new Menu();

        while (true) {
            menu.showMenu();
            int selectedMenuItem = getUserSelectedMenuItem();
            menu.execute(selectedMenuItem, carCatalog);
        }
    }

    private static int getUserSelectedMenuItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter menu item to execute:");
        int selectedMenuItem = Integer.parseInt(sc.nextLine());
        return selectedMenuItem;
    }

    private static void showMenu() {
        System.out.println("Program menu:");
        System.out.println("1. Add car");
        System.out.println("2. Show all cars");
        System.out.println("3. Exit");
    }

}
