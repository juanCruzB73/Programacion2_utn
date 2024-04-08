package ejercitacionDeRepaso;

public class Animal {
    private String name;
    private int age;
    private String gender;
    public Animal(){}

    public Animal(String name, int age, String gender) {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void doSound(){
        System.out.printf("El animal hace un sonido genérico.");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
