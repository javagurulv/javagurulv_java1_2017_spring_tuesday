package lesson11;

public class Book extends Object {

    private String title;

    public Book(String title) throws IllegalTitleException {
        if (title == null || title.isEmpty()) {
            throw new IllegalTitleException("Title is empty");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
