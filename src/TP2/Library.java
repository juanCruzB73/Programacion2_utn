package TP2;
import java.util.ArrayList;

public class Library{
    ArrayList<Book> books;
    public Library(){
        this.books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void listBooksAvailable(){
        System.out.println("lista de libros Disponibles: ");
        if(books.size()>0){
            for (Book book: books) {
                if(!book.isBorrowed()){
                    System.out.println(book.getTittle());
                }
            }
        }else {
            System.out.println("no hay libros disponibles en la biblioteca");
        }
    }
    public void borrowBook(String bookTittle){
        for(Book book: books){
            if(book.getTittle().equalsIgnoreCase(bookTittle)){
                if(!book.isBorrowed()){
                    book.borrow();
                    System.out.println(book.getTittle()+" prestado con exito");
                }else{
                    System.out.println(book.getTittle()+" se escuentra prestado pidalo en otro momento");
                }
            }
        }
    }
    public void returnBook(String bookTittle){
        for(Book book: books){
            if(book.getTittle().equalsIgnoreCase(bookTittle)){
                if(book.isBorrowed()){
                    book.giveBack();
                    System.out.println(book.getTittle()+" devuelto con exito");
                }else {
                    System.out.println(book.getTittle()+" ya se encuntra en la biblioteca, no estaba prestado");
                }

            }
        }
    }
}
