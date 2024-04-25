package TP3.Ejercicio1;
import java.util.*;

public class Profesor extends Persona {

    private String departamento;
    private Map<String, Asignatura> asignaturas;
    public Profesor(int dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
        this.asignaturas = new HashMap<>();
    }
    public String getDepartamento() {
        return departamento;
    }

    public void AsignarImparte(Asignatura asignatura) {
        asignaturas.put(asignatura.getNombre(), asignatura);
    }

    // Método para recibir una lista de asignaturas y asignarlas al profesor
    public List<Asignatura> getAsignaturas() {
        List<Asignatura> asignaturas = new ArrayList<>();
        for (Asignatura asignatura : this.asignaturas.values()) {
            asignaturas.add(asignatura);
        }
        return asignaturas;
    }
}
