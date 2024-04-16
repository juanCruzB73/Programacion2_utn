package EjerciciosRelaciones.AsociacionUnidireccional;

public class Main {
    public static void main(String[] args) {
        University u1 = new University("Universidad 1");
        University u2 = new University("Universidad 2");


        Student student1 = new Student("estudiante 1",u1);
        Student student2 = new Student("estudiante 2", u2);

        System.out.println(student1.getName() + " pertenece a la universidad " + student1.getUniversity().getName());
        System.out.println(student2.getName() + " pertenece a la universidad " + student2.getUniversity().getName());

        student1.changeUniversity(u2);
        System.out.println("se realiza cambio de universidad");
        System.out.println(student1.getName() + " ahora pertenece a la universidad " + student1.getUniversity().getName());
    }
}
