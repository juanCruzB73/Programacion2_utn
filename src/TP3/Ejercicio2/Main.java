package TP3.Ejercicio2;

public class Main {
    public static void main(String[]args){
        Employee surpevisor=new Employee("elliot");//se crea supervisor
        Employee employee=new Employee("terry");//se crea el empleado
        employee.asingSupervisor(surpevisor);//a empleado se le asigna supervidor
        //salida de datos:
        System.out.println(employee.getNameSupervisor());
        System.out.println(surpevisor.getNameSupervisor());
    }
}
