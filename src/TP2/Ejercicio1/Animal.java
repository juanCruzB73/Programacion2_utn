package TP2.Ejercicio1;
public class Animal {

    String nombre;

    int edad ;

    String tipoAnimal;

    double precio;

    public Animal (String nombre, int edad,String tipoAnimal,double precio){

        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }


    //metodos
    public void Alimentar(String nombre){

        System.out.println("Alimentando a "+nombre);

    }

    @Override
    public String toString() {

        return "el nombre del animal es "+nombre+" tiene "+edad+" de edad y es un "+tipoAnimal;

    }
}
