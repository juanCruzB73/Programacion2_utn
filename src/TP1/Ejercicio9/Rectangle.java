package TP1.Ejercicio9;
import static java.lang.Math.PI;
public class Rectangle extends GeometricFigure{
    private double base;
    private double height;

    public Rectangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void area(){
        System.out.println("el area del rectangulo es de: "+base*height);
    }
    @Override
    public void perimeter(){
        double perimeter=(base*2)+(height*2);
        System.out.println("el perimetro del rectangulo es de: "+perimeter);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
