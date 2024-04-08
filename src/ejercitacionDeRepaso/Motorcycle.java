package ejercitacionDeRepaso;

public class Motorcycle extends Byke{
    private double speed;
    private double displacement;
    public Motorcycle(){}
    public Motorcycle(String color,int wheels,String type,double speed,double displacement){
        super(color,wheels,type);
        this.speed=speed;
        this.displacement=displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDisplacement() {
        return displacement;
    }

    public double getSpeed() {
        return speed;
    }
}
