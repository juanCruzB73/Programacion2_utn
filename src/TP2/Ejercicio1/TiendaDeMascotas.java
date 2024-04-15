package TP2.Ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class TiendaDeMascotas {
   public List<Animal> animales;
   public TiendaDeMascotas() {
      animales = new ArrayList<>();
   }
   public void addAnimal(Animal animal){
      animales.add(animal);
   }
   public void venderAnimal(String nombre){
      Animal animalVendido = null;
      for (Animal animal : animales) {
         if (animal.nombre.equals(nombre)) {
            animalVendido = animal;
            break;
         }
      }
      if (animalVendido != null) {
         animales.remove(animalVendido);
         System.out.println("Se vendio al animal llamado: " + animalVendido.nombre + ", por: " + animalVendido.precio);
      } else {
         System.out.println("ninguna animal se llama asi");
      }
   }
   public void alimentarAnimal(String nombre){

      for (Animal animal : animales) {
         if (animal.nombre.equals(nombre)) {
            animal.Alimentar(nombre);
            System.out.println("Se ha alimentado a la mascota: " + animal.nombre);
            return;
         }
      }
         System.out.println("ninguna animal se llama asi");
      }
   public void listarAnimales(){

      for(Animal animal  : animales){
         System.out.println("------------------------");
         switch (animal.getClass().getSimpleName()){
            case "Perro":{
               System.out.println("datos de perro:");
               System.out.println("Nombre "+animal.nombre+" Edad :"+animal.edad+" Precio :"+animal.precio+" es un "+animal.tipoAnimal+
               " y su raza es :"+((Perro)animal).raza);
               if (((Perro) animal).vacunado){
                  System.out.println(" y si tiene las vacunas al dia");
               }else{
                  System.out.println(" no tiene las vacunas al dia");
               }
               break;
            }
            case "Gato":{

               System.out.println("datos de gato:");

               if(((Gato) animal).esterelizado){
                  System.out.println("Esta esterelizado");
               }else{
                  System.out.println("no esta esterelizado");
               }
               System.out.println("Nombre "+animal.nombre+" Edad :"+animal.edad+" Precio :"+animal.precio+" y es un "+animal.tipoAnimal+
                " y su raza es :"+((Gato)animal).raza);
               break;
            }
            case "Ave":{

               System.out.println("datos de perro");

               if ( ((Ave)animal).habla ){
                  System.out.println("puede hablar");
               }else{
                  System.out.println("no puede hablar");
               }
               System.out.println("Nombre "+animal.nombre+" Edad :"+animal.edad+" Precio :"+animal.precio+" y es un "+animal.tipoAnimal+
                       " y su raza es :"+((Ave)animal).especie);
               break;
            }
            case "Pez":{

               System.out.println("datos de pez");

               System.out.println("Nombre "+animal.nombre+" Edad :"+animal.edad+" Precio :"+animal.precio+" y es un "+animal.tipoAnimal+
                       " y es de color :"+((Pez)animal).color+" y es de tamaño "+((Pez)animal).forma);
               break;
            }
            default:{
               System.out.println("no se encuetra el animal solicitado");
               break;
            }
         }
      }
   }
}
