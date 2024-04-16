package EjerciciosRelaciones.Agregacion;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("elliot", "tecnico");
        Employee employee2 = new Employee("terry", "god's favourite programer");
        Employee employee3 = new Employee("lain", "god");

        Department department1 = new Department("departamento1");

        department1.addEmployee(employee1);
        department1.addEmployee(employee2);

        System.out.println("Empleados del departamento " + department1.getName() + ":");
        for (Employee employee : department1.getEmployees()) {
            System.out.println("- Nombre: " + employee.getName() + ", Cargo: " + employee.getPosition());
        }
    }

    }
