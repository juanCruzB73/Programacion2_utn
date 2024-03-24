package tp1;

public class Dog extends Animal{
    private String color;
    private String race;
    public Dog(){}
    public Dog(String name,int age,String gender, String color,String race){
        super(name,age,gender);
        this.color=color;
        this.race=race;
    }
    public void doSound(){
        System.out.println("wof wof");
    }
    public void showinfo(){
        System.out.println("name: "+this.getName()+" age: "+getAge()+" gender: "+getGender()+" color: "+this.color+" race: "+this.race);
    }
    public void followTail(){
        System.out.printf("el perro esta persiguiendo su cola");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public String getRace() {
        return race;
    }
}
