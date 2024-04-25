package TP3.Ejercicio1;
import java.util.*;

public class Alumno extends Persona{

    Grupo grupo;
    private List<Asignatura> asignaturasRecibidas;
    public Alumno(){}
    public Alumno(int dni,String nombre){
        super(dni, nombre);

        this.asignaturasRecibidas= new ArrayList<>();

    }

    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturasRecibidas.add(asignatura);
    }

    public List<Asignatura> getAsignaturasRecibidas() {

        return asignaturasRecibidas;
    }

}




