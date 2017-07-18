package lesson7;

public class Car {

    private String model;  // required
    private String color;  // not required
    private int price;     // required

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return price;
    }

}
