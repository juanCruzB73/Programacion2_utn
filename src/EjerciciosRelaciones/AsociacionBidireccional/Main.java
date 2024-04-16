package EjerciciosRelaciones.AsociacionBidireccional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Franco");
        Person person2 = new Person("Ale");

        Book book1 = new Book("Linux bible");
        Book book2 = new Book("think in java");

        person1.addBook(book1);
        person1.addBook(book2);
        person2.addBook(book1);

        book1.addOwner(person1);
        book1.addOwner(person2);
        book2.addOwner(person1);

        System.out.println(person1.getName() + " tiene los siguientes libros:");
        for (Book book : person1.getBooks()) {
            System.out.println("- " + book.getTitle());
        }

        System.out.println(person2.getName() + " tiene los siguientes libros:");
        for (Book book : person2.getBooks()) {
            System.out.println("- " + book.getTitle());
        }

        System.out.println("El libro '" + book1.getTitle() + "' es propiedad de:");
        for (Person person : book1.getOwners()) {
            System.out.println("- " + person.getName());
        }

    }
}