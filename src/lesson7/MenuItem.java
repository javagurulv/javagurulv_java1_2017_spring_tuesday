package lesson7;

public class MenuItem {

    private String title;
    private Service service;

    public MenuItem(String title, Service service) {
        this.title = title;
        this.service = service;
    }

    public String getTitle() {
        return title;
    }

    public Service getService() {
        return service;
    }
}
