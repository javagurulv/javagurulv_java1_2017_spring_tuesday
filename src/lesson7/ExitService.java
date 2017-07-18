package lesson7;

public class ExitService implements Service {

    public void execute(InMemoryCarCatalog carCatalog) {
        System.out.println("Good by!");
        System.exit(0);
    }

}
