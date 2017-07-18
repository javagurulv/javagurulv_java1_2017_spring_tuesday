package lesson7;

import java.util.List;

public class ShowAllCarsService implements Service {

    public void execute(InMemoryCarCatalog carCatalog) {
        List<Car> cars = carCatalog.getAllCars();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(i + " model=" + car.getModel() + " price=" + car.getPrice());
        }
    }

}
