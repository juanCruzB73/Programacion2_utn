package EjercicioEnClase1;
import java.lang.Math.*;
public class Circle implements Figure,Drawable{
    private float radius;
    public Circle(float radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        double result=Math.pow(radius*Math.PI,2);
        System.out.println("el area del cuadrado es de "+result);
    }
    @Override
    public void draw(){
        System.out.println("circulo dibujado");
    }
}
