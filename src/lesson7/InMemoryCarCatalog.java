package lesson7;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCarCatalog {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }

}
