package TP2.Ejercicio1;
public class Perro extends Animal{

    String raza ;
    boolean vacunado;

    public Perro(String nombre,int edad,String tipoAnimal,double precio,String raza,boolean vacunado){
        super(nombre,edad,tipoAnimal,precio);
        this.raza=raza;
        this.vacunado= vacunado;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
}
