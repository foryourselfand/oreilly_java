package Ch16.Pencil;

public class Book implements Comparable<Book> {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        return getTitle().compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                '}';
    }
}
