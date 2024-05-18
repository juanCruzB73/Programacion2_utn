package TP4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }
    public boolean checkNumber(int num,int numToGuess){
        if(num>numToGuess){
            System.out.println("el numero que ingreso es mayor");
            return false;
        } else if (num<numToGuess) {
            System.out.println("el numero que ingreso es menor");
            return false;
        }else {
            return true;
        }
    }
    public static void main(String[]args)throws MyCustomException{
        Random random = new Random();
        Ejercicio1 main=new Ejercicio1();
        int numToGuess = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int trys = 0;
        boolean condition=false;
        Scanner sc=new Scanner(System.in);
        do {
            try{
                System.out.println("INGRESE SU NUMERO:");
                int num= sc.nextInt();
                condition= main.checkNumber(num,numToGuess);
            }catch (InputMismatchException e) {
                System.out.println("¡Debes introducir un número entero!");
                sc.next(); // Limpiar el búfer de entrada
            }
        }while (condition==false);
        System.out.println("ADIVINASTE EL NUMERO ERA "+numToGuess);
    }
}
