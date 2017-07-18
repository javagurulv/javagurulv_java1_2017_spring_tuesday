package lesson7;

import java.util.Scanner;

public class AddCarService implements Service {

    public void execute(InMemoryCarCatalog carCatalog) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter model:");
        String model = sc.nextLine();

        System.out.print("Enter price:");
        int price = Integer.parseInt(sc.nextLine());

        Car car = new Car(model, price);
        carCatalog.addCar(car);
    }

}
