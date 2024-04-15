package TP2;

import TP1.Ejercicio10.Libro;
import TP1.Ejercicio10.Novela;

public class Main {
    /*
    Desarrollar un sistema de gestión para una biblioteca.
    En el main crea una biblioteca, un libro de cada clase y utilizá todos los métodos definidos.
     */
    public static void main(String[]args){
        Library library = new Library();

        Novel ElSabuesoDeLosBaskerville=new Novel("El Sabueso De Los Baskerville","Arthut Conan Doyle",1902,"Criminal");
        Infantile TresCerditos=new Infantile("Tres cerditos","Joseph Jacobs",1949,5);
        Universitary LinuxBible=new Universitary("Linux Bible","Christopher Negus",2019,"programacion");

        //metodos listbook y add
        library.listBooksAvailable();//escribe mensaje de que no hay libros
        //se agregan tres libros
        library.addBook(ElSabuesoDeLosBaskerville);
        library.addBook(TresCerditos);
        library.addBook(LinuxBible);
        //como ahora hay libros se listan
        library.listBooksAvailable();

        //metodos borrowBook y return book
        library.borrowBook("el sabueso de los baskerville");//se presta libro no importan las mayusculas
        library.borrowBook("el sabueso de los baskerville");//el libro no se presta porque ya se encuentra prestado
        library.returnBook("el sabueso de los baskerville");//se devuelve el libro con exito
        library.returnBook("el sabueso de los baskerville");//como el libro ya fue devuelto no puede volver a devolverse
    }
}
