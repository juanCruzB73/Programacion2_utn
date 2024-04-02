package actividadEnClase19DeMarzo;

public class Empleado {
    String name;
    String lastName;
    public Empleado(String name,String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return name+" "+lastName;
    }
}
