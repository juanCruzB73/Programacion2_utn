package TP2.Ejercicio1;
public class Gato extends Animal{

    String raza ;

    boolean esterelizado;

    public Gato(String nombre,int edad,String tipoAnimal,double precio,String raza,boolean esterelizado){
        super(nombre,edad,tipoAnimal,precio);
        this.raza=raza;
        this.esterelizado=esterelizado;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEsterelizado(boolean esterelizado) {
        this.esterelizado = esterelizado;
    }
}
