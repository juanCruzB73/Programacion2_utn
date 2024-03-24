package tp1;

public class Car extends Vehicle{
    private double speed;
    private double displacement;
    public Car(){

    }
    public Car(String color,int wheels,double speed,double displacement){
        super(color,wheels);
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