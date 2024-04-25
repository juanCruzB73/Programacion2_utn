package TP3.Ejercicio1;
public class Persona {

     protected int dni ;

    protected String nombre ;

    public Persona(){}

    public Persona(int dni,String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
}
