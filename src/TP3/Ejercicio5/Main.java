package TP3.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar una nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar una tarea específica");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addTask(taskList, scanner);
                    break;
                case 2:
                    showTasks(taskList);
                    break;
                case 3:
                    removeTask(taskList, scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 4.");
            }
        }

        scanner.close();
    }

    private static void addTask(TaskList taskList, Scanner scanner) {
        System.out.print("\nIngrese la descripción de la tarea: ");
        String description = scanner.nextLine();
        System.out.print("Ingrese la prioridad de la tarea(en enteros): ");
        int priority = scanner.nextInt();
        scanner.nextLine();

        Task task = new Task(description, priority);
        taskList.addTask(task);
        System.out.println("Tarea agregada exitosamente.");
    }

    private static void showTasks(TaskList taskList) {
        System.out.println("\nTareas:");
        for (Task task : taskList) {
            System.out.println("Descripción: " + task.getDescription() + ", Prioridad: " + task.getPriority());
        }
    }

    private static void removeTask(TaskList taskList, Scanner scanner) {
        System.out.print("\nIngrese la descripción de la tarea a eliminar: ");
        String description = scanner.nextLine();
        taskList.removeTask(description);
        System.out.println("Tarea eliminada exitosamente.");
    }
}
