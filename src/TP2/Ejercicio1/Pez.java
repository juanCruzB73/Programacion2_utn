package TP2.Ejercicio1;
public class Pez extends Animal{
    String color;
    String forma;

    public Pez(String nombre,int edad,String tipoAnimal,double precio,String color,String forma){
        super(nombre,edad,tipoAnimal,precio);
        this.color=color;
        this.forma=forma;

    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }


}
