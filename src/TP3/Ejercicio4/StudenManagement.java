package TP3.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudenManagement {

    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Calcular y mostrar media de notas");
            System.out.println("4. Mostrar alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addStudent(studentsList, scanner);
                    break;
                case 2:
                    showStudentsList(studentsList);
                    break;
                case 3:
                    calculateAverageGrade(studentsList);
                    break;
                case 4:
                    showStudentWithHighestGrade(studentsList);
                    break;
                case 5:
                    searchStudentByName(studentsList, scanner);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 6.");
            }
        }

        scanner.close();
    }

    private static void addStudent(ArrayList<Student> studentsList, Scanner scanner) {
        System.out.println("\nAgregar nuevo alumno:");
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Edad: ");
        int age = scanner.nextInt();
        System.out.print("Nota: ");
        double grade = scanner.nextDouble();

        Student student = new Student(name, age, grade);
        studentsList.add(student);
        System.out.println("Alumno agregado correctamente.");
    }

    private static void showStudentsList(ArrayList<Student> studentsList) {
        System.out.println("\nLista de alumnos:");
        for (Student student : studentsList) {
            System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge() + ", Nota: " + student.getGrade());
        }
    }

    private static void calculateAverageGrade(ArrayList<Student> studentsList) {
        if (studentsList.isEmpty()) {
            System.out.println("\nThere are no students in the list.");
            return;
        }

        double totalGrade = 0;
        for (Student student : studentsList) {
            totalGrade += student.getGrade();
        }
        double average = totalGrade / studentsList.size();
        System.out.println("\nLa media de notas de todos los alumnos es: " + average);
    }

    private static void showStudentWithHighestGrade(ArrayList<Student> studentsList) {
        if (studentsList.isEmpty()) {
            System.out.println("\nNo hay alumnos en la lista.");
            return;
        }

        Student topStudent = studentsList.get(0);
        for (Student student : studentsList) {
            if (student.getGrade() > topStudent.getGrade()) {
                topStudent = student;
            }
        }
        System.out.println("\nEl alumno con la nota más alta es:");
        System.out.println("Nombre: " + topStudent.getName() + ", Edad: " + topStudent.getAge() + ", Nota: " + topStudent.getGrade());
    }

    private static void searchStudentByName(ArrayList<Student> studentsList, Scanner scanner) {
        System.out.print("\nIngrese el nombre del alumno a buscar: ");
        String nameToSearch = scanner.nextLine();

        boolean found = false;
        for (Student student : studentsList) {
            if (student.getName().equalsIgnoreCase(nameToSearch)) {
                System.out.println("\nAlumno encontrado:");
                System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge() + ", Nota: " + student.getGrade());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No se encontró ningún alumno con ese nombre.");
        }
    }
}