//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package TP2.Ejercicio1;
public class Main {
    public static void main(String[] args) {

        TiendaDeMascotas tienda = new TiendaDeMascotas();

        Perro perro = new Perro("perro1",7,"perro",12.50,"caniche",false);

        Gato gato = new Gato("gato2",3,"gato",15.50,"blanco",true);

        Ave ave = new Ave("ave1",2,"pajaro",20.5,"siete cuchillos",true);

        Pez pez = new Pez("pez1",1,"pez",7.5,"dorado","chica");

        tienda.addAnimal(perro);
        tienda.addAnimal(gato);
        tienda.addAnimal(ave);
        tienda.addAnimal(pez);

        tienda.listarAnimales();

        System.out.println("------------------------");

        System.out.println("Venta de animales:");

        tienda.venderAnimal("ave1");

        System.out.println("------------------------");

        System.out.println("Alimentacion de animales:");

        tienda.alimentarAnimal("perro1");

        System.out.println("------------------------");

        System.out.println("Presentacion del animal:");

        System.out.println(perro);


        }

}
