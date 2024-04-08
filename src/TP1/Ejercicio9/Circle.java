package TP1.Ejercicio9;
import static java.lang.Math.*;
public class Circle extends GeometricFigure{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        System.out.println("el area del circulo es de: "+(Math.pow(radius,2))*Math.PI);
    }
    @Override
    public void perimeter(){
        System.out.println("el perimetro es de: "+2*radius*Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
