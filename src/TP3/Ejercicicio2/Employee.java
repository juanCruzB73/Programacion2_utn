package TP3.Ejercicicio2;

public class Employee {
    private String name;
    private Employee surpervisor;
    private boolean hasSupervisor;
    public Employee(String name){
        this.name=name;
        this.hasSupervisor=false;
    }

    public String getName() {
        return name;
    }

    public void asingSupervisor(Employee surpervisor){
        this.surpervisor=surpervisor;
        this.hasSupervisor=true;
    }
    public String getNameSupervisor(){
        if(hasSupervisor){
            return surpervisor.getName();
        }else {
            return "el empleado no tiene supervisor";
        }
    }
}
