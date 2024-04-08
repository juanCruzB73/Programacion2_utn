package TP1;
import TP1.Ejercicio8.*;
import TP1.Ejercicio9.*;
import TP1.Ejercicio10.*;

public class Main {
    public static void main(String[]args){
        //EJERCICIO 8
        Manager manager1=new Manager("juan",20,10000,true,"managment");
        Worker worker1=new Worker("samuel",35,5000,true,"production");

        System.out.println();

        manager1.organising();
        worker1.producing();

        //EJERCICIO 9
        Rectangle rectangle=new Rectangle(10,5);
        Circle circle=new Circle(20);

        rectangle.area();
        rectangle.perimeter();

        System.out.println();

        circle.area();
        circle.perimeter();

        //EJERCICIO 10
        Libro libro1=new Libro("la metamorfosis","kafka");
        libro1.setPrice(2000);
        libro1.print();

        System.out.println();

        LibroTexto libroTexto1 = new LibroTexto("Linux for beginners","the Prime time","segundo");
        libroTexto1.setPrice(6000);
        libroTexto1.print();

        System.out.println();

        LibroTextoUniversidadNacionalColombia libroTextoUniversidadNacionalColombia = new LibroTextoUniversidadNacionalColombia("libro colombiano","un colombiano","tercero","iniversidad colombiana");
        libroTextoUniversidadNacionalColombia.setPrice(10000);
        libroTextoUniversidadNacionalColombia.print();

        System.out.println();

        Novela novela1 = new Novela("Estudio escarlata","Arthur Conan doyle","policiaca");
        novela1.setPrice(5000);
        novela1.print();

    }
}
