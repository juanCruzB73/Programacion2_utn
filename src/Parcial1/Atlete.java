package Parcial1;
import java.lang.Math;

public class Atlete extends Person implements Contract{
    private double height;
    private int age;
    private double weight;

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Atlete(int dni, String name, double height, int age, double weight){
        super(dni, name);
        this.height=height;
        this.age=age;
        this.weight=weight;
    }

    @Override
    public double calculateIMC(){
        double total;
        total=(weight)/(height*height);
        return total;
    }
    @Override
    public boolean overWeight(){
        double imc= calculateIMC();
        if(imc>25){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public double checkPulse(double time, double restingHeartRate, double amplitude, double variation){
        double baselinePulse = amplitude * Math.sin(2 * Math.PI * time * (restingHeartRate / 60.0));

        double randomFactor = 1.0 + variation * (Math.random() - 0.5);
        double total=baselinePulse * randomFactor;
        return total;
    }
}
