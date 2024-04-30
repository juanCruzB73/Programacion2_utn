package ExepcionesEjercitacion;
import java.util.Scanner;

public class Main {
    Scanner sc=new Scanner(System.in);
    public double[] askInputs(){
        double[]numbers=new double[2];
        int counter=0;
        double num = 0;
        while (true){
            if(counter==2){
                break;
            }
            try {
                System.out.println("----ingrese el numero "+(counter+1)+"----");
                num=sc.nextDouble();
                numbers[counter]=num;
                counter++;
            }catch (Exception e){
                System.out.println("----no ingreso un numero valido vuelva a intentarlo-----");
                sc.nextLine();
            }
        }
        return numbers;
    }
    public double suma(double num1,double num2){
        double result=num1+num2;
        return result;
    }
    public double resta(double num1,double num2){
        double result=num1-num2;
        return result;
    }
    public double multi(double num1,double num2){
        double result=num1*num2;
        return result;
    }
    public double div(double num1,double num2){
        double result=num1/num2;
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Main main = new Main();
        double result;
        while (true){
            int option;
            System.out.println("menu: "+"\n"+"1.suma"+"\n"+"2.resta"+"\n"+"3.multiplicacion"+"\n"+"4.division"+"\n"+"5.salir");
            try{
                option=sc.nextInt();
                double[] numbers= main.askInputs();
                switch (option){
                    case 1:
                        result=main.suma(numbers[0],numbers[1]);
                        System.out.println(result);
                        break;
                    case 2:
                        result=main.resta(numbers[0],numbers[1]);
                        System.out.println(result);
                        break;
                    case 3:
                        result=main.multi(numbers[0],numbers[1]);
                        System.out.println(result);
                    case 4:
                        try {
                            result=main.div(numbers[0],numbers[1]);
                            System.out.println(result);
                        }catch (Exception e){
                            System.out.println("no es posible divir por cero");
                        }
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("ingrese un valor valido");
                }
            }catch (Exception e){
                System.out.println("ingrese un valor valido");
                sc.nextLine();
            }
        }
    }
}
