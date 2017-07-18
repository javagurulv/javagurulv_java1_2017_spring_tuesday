package lesson7;

public class Menu {

    private MenuItem[] items = {
            new MenuItem("Add Car", new AddCarService()),
            new MenuItem("Show All Cars", new ShowAllCarsService()),
            new MenuItem("Exit", new ExitService())
    };

    public void showMenu() {
        for (int i = 0; i < items.length; i++) {
            MenuItem menuItem = items[i];
            System.out.println((i + 1) + ". " + menuItem.getTitle());
        }
    }

    public void execute(int selectedMenuItem,
                        InMemoryCarCatalog carCatalog) {
        MenuItem menuItem = items[selectedMenuItem - 1];
        Service service = menuItem.getService();
        service.execute(carCatalog);
    }

}
