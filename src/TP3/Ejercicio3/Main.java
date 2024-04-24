package TP3.Ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[]args){
        ArrayList<String>days=new ArrayList<>();
        //String days[] = new String[7];
        days.add("domingo");
        days.add("lunes");
        days.add("martes");
        days.add("miercoles");
        days.add("jueves");
        days.add("viernes");
        days.add("sabado");
        days.add(4,"juernes");
        System.out.println(days.get(2));//Elemento en la posición 3
        System.out.println(days.get(3));//Elemento en la posición 4
        // Mostrar el primer y último elemento de la lista
        System.out.println(days.get(0));
        System.out.println(days.get(days.size()-1));
        System.out.println("semana con juernes:");
        days.forEach(e-> System.out.println(e));
        //eliminar el elemento juernes
        if(days.contains("juernes")){
            days.remove("juernes");
            System.out.println("lista sin juernes:");
            days.forEach(e-> System.out.println(e));
        }else {
            System.out.println("la lista no contenia juernes");
        }
        //iterador que muestre todos los elementos de la lista
        Iterator<String>it=days.iterator();
        System.out.println("recorriendo la lista con un iterado:");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //buscar si existe lunes ignorando mayuscula
        boolean foundLunes = false;
        for (String day : days) {
            if (day.equalsIgnoreCase("Lunes")) {
                foundLunes=true;
                break;
            }
        }
        if(foundLunes){
            System.out.println("si se encontro lunes en la lista");
        }else {
            System.out.println("no se encontro lunes en la lista");
        }
        //borrar todos los elementos de la lista
        days.clear();
        System.out.println("se borraron los dias de la lista");
    }
}
