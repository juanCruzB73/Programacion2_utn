package RepasoArreglos;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    Scanner sc=new Scanner(System.in);
    public ArrayList<Integer>getNumbers(){
        ArrayList<Integer>integers=new ArrayList<>();
        for(int i=0;i<10;i++) {
            try {
                System.out.println("ingrese el numero " + (i + 1));
                int num = sc.nextInt();
                integers.add(num);
            } catch (Exception e) {
                System.out.println("ingrese solo numeros enteros");
                sc.nextLine();
                i--;
            }
        }
        return integers;
    }
    public boolean isPrime(int num){
        for (int i=2;i<num-1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public void ejercicio1(){
        ArrayList<Integer>integers=getNumbers();
        int biggest=integers.get(0);
        for(int num: integers){
            if(num>biggest){
                biggest=num;
            }
        }
        System.out.println("el mayor numero ingresado es el "+biggest);
    }
    public void ejercicio2(){
        ArrayList<Integer>integers=getNumbers();
        Integer index=0;
        int biggest=integers.get(0);
        for(int num: integers){
            if(num>biggest){
                biggest=num;
            }
        }
        ArrayList<Integer>positions=new ArrayList<Integer>();
        for(int num: integers){
            if(num==biggest){
                positions.add(index);
            }
            index++;
        }
        int finalBiggest = biggest;
        positions.forEach(s -> System.out.println("el mayor numero ingresado "+ finalBiggest +" esta en la/s pocicion/es: "+s));
    }
    public void ejercicio3(){
        int[] primes = new int[10];
        int index = 0;
        for (int i=100;i<300;i++){
            if(index==10){
                break;
            }
            if(isPrime(i)){
                primes[index]=i;
                index++;
            }
        }
        System.out.println("los 10 numeros primos son: ");
        for(int num:primes){
            System.out.println(num);
        }
    }
    public void ejercicio4(){
        int index=0;
        ArrayList<Integer>integers=getNumbers();
        ArrayList<Integer>positions=new ArrayList<Integer>();
        for(Integer num: integers){
            String stringNum=num.toString();
            Character lastChar = stringNum.charAt(stringNum.length()-1);
            if(lastChar.equals('4')){
                positions.add(index);
            }
            index++;
        }
        System.out.println("los numeros terminados en 4 de los ingresados son los que estan en las pociciones: ");
        positions.forEach(p-> System.out.println(p));
    }
    public void ejercicio5(){
        ArrayList<Integer>integers=getNumbers();
        int counter=0;
        int biggest=integers.get(0);
        for(int num: integers){
            if(num>biggest){
                biggest=num;
            }
        }
        ArrayList<Integer>positions=new ArrayList<Integer>();
        for(int num: integers){
            if(num==biggest){
                counter++;
            }
        }
        System.out.println("el mayor numero ingresado fue "+biggest+" y se repite un total de "+counter+" veces");
    }
    public static void main(String[]args){
        Main myProgram =  new Main();


        //destilde el ejercicio en particular a probar


        //myProgram.ejercicio1();
        //myProgram.ejercicio2();
        //myProgram.ejercicio3();
        //myProgram.ejercicio4();
        //myProgram.ejercicio5();
    }
}
