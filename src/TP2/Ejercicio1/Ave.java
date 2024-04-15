package TP2.Ejercicio1;
public class Ave extends Animal{

    String especie;
    boolean habla;

    public Ave(String nombre,int edad,String tipoAnimal,double precio,String especie,boolean habla){
        super(nombre,edad,tipoAnimal,precio);
        this.especie=especie;
        this.habla=habla;

    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setHabla(boolean habla) {
        this.habla = habla;
    }



}

