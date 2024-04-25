package TP3.Ejercicio1;
import java.util.*;

public class Asignatura {
    private int aula;
    private String hora;
    private String nombre;
    private Map<Character, List<Alumno>> grupos;

    List<Asignatura>asignaturas = new ArrayList<>();

    public Asignatura(int aula, String hora, String nombre) {
        this.aula = aula;
        this.hora = hora;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void recibirGrupos(Map<Character, String> grupos) {
        for (Map.Entry<Character, String> entry : grupos.entrySet()) {
            Character letra = entry.getKey();
            String curso = entry.getValue();

        }
    }
    public Map<Character, List<Alumno>> getGrupos() {
        return grupos;
    }

}
