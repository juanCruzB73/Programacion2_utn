package TP3.Ejercicio1;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Alumno alumno1 = new Alumno(987654321, "Pedro");
        Alumno alumno2 = new Alumno(987654322, "María");
        Alumno alumno3 = new Alumno(841684321, "Carlos");
        Alumno alumno4 = new Alumno(219875546, "Jose");


        Grupo grupoA = new Grupo("1A", 'A');
        Grupo grupoB = new Grupo("2B", 'B');

        grupoA.agregarAlGrupo('A', alumno1);
        grupoA.agregarAlGrupo('A', alumno2);
        grupoB.agregarAlGrupo('B', alumno3);
        grupoB.agregarAlGrupo('B', alumno4);


        Asignatura matematicas = new Asignatura(101, "8:00", "Matematica");
        Asignatura fisicas = new Asignatura(103, "10:30", "Fisica");
        Asignatura historia = new Asignatura(102, "10:00", "Historia");


        alumno1.agregarAsignatura(matematicas);
        alumno2.agregarAsignatura(matematicas);
        alumno3.agregarAsignatura(historia);
        alumno4.agregarAsignatura(historia);

        Map<Character, String> gruposAsignatura = new HashMap<>();
        gruposAsignatura.put('A', "1A");
        gruposAsignatura.put('B', "2B");
        matematicas.recibirGrupos(gruposAsignatura);
        historia.recibirGrupos(gruposAsignatura);
        fisicas.recibirGrupos(gruposAsignatura);


        Profesor profesorMatematicas = new Profesor(123456789, "Juan", "Matemática y Fisica");
        Profesor profesorHistoria = new Profesor(987654321, "María", "Historia");


        profesorMatematicas.AsignarImparte(matematicas);
        profesorMatematicas.AsignarImparte(fisicas);
        profesorHistoria.AsignarImparte(historia);

        // Pedimos una asignatura existente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de una asignatura existente: ");
        String nombreAsignatura = scanner.nextLine();

        // Buscamos al profesor que imparte la asignatura
        Profesor profesorAsignatura = null;
        if (nombreAsignatura.equalsIgnoreCase(matematicas.getNombre()) || nombreAsignatura.equalsIgnoreCase(fisicas.getNombre())) {
            profesorAsignatura = profesorMatematicas;
        } else if (nombreAsignatura.equalsIgnoreCase(historia.getNombre())) {
            profesorAsignatura = profesorHistoria;
        } else {
            System.out.println("La asignatura ingresada no existe.");
            return;
        }

        System.out.println("Asignaturas recibidas por el primer grupo al que pertenece el alumno:");
        Map<Character, List<Alumno>> gruposNombres = grupoA.getGrupos();
        for (Map.Entry<Character, List<Alumno>> entry : gruposNombres.entrySet()) {
            if (entry.getKey().equals('A')) { // Si es el primer grupo al que pertenece el alumno
                List<Alumno> alumnos = entry.getValue();
                for (Alumno alumno : alumnos) {
                    System.out.println("Alumno: " + alumno.getNombre());
                    System.out.println("Asignaturas recibidas:");
                    for (Asignatura asignatura : alumno.getAsignaturasRecibidas()) {
                        System.out.println("- " + asignatura.getNombre());
                    }
                    System.out.println();
                }
            }
        }

        Asignatura segundaAsignatura = null;
        List<Asignatura> asignaturasProfesor = profesorAsignatura.getAsignaturas();
        if (asignaturasProfesor.size() > 1) {
            segundaAsignatura = asignaturasProfesor.get(1);
        }

        System.out.println("Nombres de los alumnos inscritos en el Grupo de la 2da. Asignatura:");
        if (segundaAsignatura != null) {
            Map<Character, List<Alumno>> gruposSegundaAsignatura = segundaAsignatura.getGrupos();
            if (gruposSegundaAsignatura != null) {
                for (Map.Entry<Character, List<Alumno>> entry : gruposSegundaAsignatura.entrySet()) {
                    System.out.println("Grupo " + entry.getKey() + ":");
                    for (Alumno alumno : entry.getValue()) {
                        System.out.println("- " + alumno.getNombre());
                    }
                }
            } else {
                System.out.println("No se encontraron alumnos inscritos en el Grupo de la segunda asignatura.");
            }
        } else {
            System.out.println("No se encontró la segunda asignatura.");
        }

    }
}