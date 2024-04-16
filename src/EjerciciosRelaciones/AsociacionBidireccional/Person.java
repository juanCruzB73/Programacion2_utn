package EjerciciosRelaciones.AsociacionBidireccional;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Book> books;

    public Person(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }


}
