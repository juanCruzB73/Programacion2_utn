package TP1.Ejercicio8;

public class Manager extends Employee {
    private String departmen;
    public Manager(String name, int age, double salary, boolean workingAvailability,String departmen){
        super(name,age,salary,workingAvailability);
        this.departmen=departmen;
    }
    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }

    public String getDepartmen() {
        return departmen;
    }
    public void organising(){
        System.out.println(getName()+" esta organizando en el departamento "+departmen);
    }
}
