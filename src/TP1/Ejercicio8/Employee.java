package TP1.Ejercicio8;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private boolean workingAvailability;
    public Employee(String name,int age,double salary,boolean workingAvailability){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.workingAvailability=workingAvailability;
    }
    public void working() {
        System.out.println(name + " está trabajando.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
