package EjercicioEnClase1;

public class Square implements Figure,Rotable,Drawable{
    private float side;
    public Square(float side){
        this.side=side;
    }
    @Override
    public void area() {
        System.out.println("el area del cuadrado es de "+side*4);
    }

    @Override
    public void rotar() {
        System.out.println("el cuadrado se roto");
    }
    @Override
    public void draw(){
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
