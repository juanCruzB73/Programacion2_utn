package TP1.Ejercicio8;

public class Worker extends Employee {
    private String workingArea;
    public Worker(String name, int age, double salary, boolean workingAvailability,String workingArea){
        super(name,age,salary,workingAvailability);
        this.workingArea=workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public String getWorkingArea() {
        return workingArea;
    }
    public void producing(){
        System.out.println(getName()+" esta produciendo en "+workingArea);
    }
}
