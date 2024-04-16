package EjerciciosRelaciones.AsociacionBidireccional;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Person> owners;

    public Book(String title) {
        this.title = title;
        this.owners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Person> getOwners() {
        return owners;
    }

    public void addOwner(Person person) {
        owners.add(person);
    }
}
