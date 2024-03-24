package tp1;

public class Cat extends Animal{

    private String color;
    public Cat(){}
    public Cat(String name,int age,String gender, String color){
        super(name,age,gender);
        this.color=color;
    }
    public void doSound(){
        System.out.println("miau");
    }
    public void showinfo(){
        System.out.println("name: "+getName()+" age: "+getAge()+" gender: "+getGender()+" color: "+this.color);
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void sleep(){
        System.out.printf("the cat is sleeping");
    }
}
