package ejercitacionDeRepaso;

public class Bird extends Animal{
    private String species;
    private String color;
    public Bird(String name,int age,String gender, String species,String color){
        super(name,age,gender);
        this.species=species;
        this.color=color;
    }
    public void doSound(){
        System.out.println("pio pio");
    }
    public void showinfo(){
        System.out.println("name: "+getName()+" age: "+getAge()+" gender: "+getGender()+" color: "+this.color+" species: "+this.species);
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }
}
