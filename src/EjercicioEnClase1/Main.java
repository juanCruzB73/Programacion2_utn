package EjercicioEnClase1;

public class Main {
    public static void main(String[] args){
        Circle circle=new Circle(20);
        Square square=new Square(5);

        circle.area();
        square.area();

        square.draw();
        square.rotar();
    }


}
