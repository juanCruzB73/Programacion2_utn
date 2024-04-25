package TP3.Ejercicio1;
import java.util.*;

public class Grupo {

    Asignatura asignatura;
    private String curso;
    char Letra;

    List<Asignatura>asignaturas;

    private Map<Character, List<Alumno>> grupos = new HashMap<>();
    public Grupo(String curso,char Letra){

        this.curso=curso;
        this.Letra=Letra;

    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setLetra(char letra) {
        Letra = letra;
    }

    public char getLetra() {
        return Letra;
    }

    public void agregarAlGrupo(char letra, Alumno alumno) {

        if (!grupos.containsKey(letra)){
            grupos.put(letra, new ArrayList<>());
        }
        grupos.get(letra).add(alumno);
    }
    public Map<Character, List<Alumno>> getGrupos() {
        Map<Character, List<Alumno>> gruposAlumnos = new HashMap<>();

        for (Map.Entry<Character, List<Alumno>> entry : grupos.entrySet()) {
            Character letraGrupo = entry.getKey();
            List<Alumno> alumnos = entry.getValue();

            // Agrega la lista de alumnos al mapa
            gruposAlumnos.put(letraGrupo, alumnos);
        }
        return gruposAlumnos;
    }

}


