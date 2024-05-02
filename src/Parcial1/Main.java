package Parcial1;

public class Main {
    public static void main(String[] args) {
        /*
        Crear al menos una instancia de cada clase.
        Mostrar:
        Desde un objeto Instalacion:
            Nombre del 3er atleta de la 2da prueba.
        Código de la 2da prueba.
        Desde un objeto EquipoNacional:
            Altura de todos los atletas.
            Peso extra de cada atleta.
         */
        //atletas
        Atlete atlete1=new Atlete(44904987,"juan",1.80,20,70);
        Atlete atlete2=new Atlete(12009735,"Dexter",1.78,38,84);
        Atlete atlete3=new Atlete(15687426,"judge holden",2.10,55,130);

        //pruebas
        Test test1=new Test(1,"carrera");
        Test test2=new Test(2,"salto");
        //prueba 1
        test1.addAtlete(atlete1);
        test1.addAtlete(atlete2);
        test1.addAtlete(atlete3);
        //prueba 2
        test2.addAtlete(atlete1);
        test2.addAtlete(atlete3);
        test2.addAtlete(atlete2);

        //sede
        Facility facility1=new Facility("fase clacificacion", "Argentina", "carrera 100 metros","sede1");
        facility1.addTest(test1);
        facility1.addTest(test2);

        System.out.println("+----------------------");
        System.out.println("El nombre del tercer atleta de la segunda prueba desde sede es "+facility1.getTests().get(1).getAtletes().get(2).getName());
        System.out.println("+----------------------");

        NationalTeam equipoNacional=new NationalTeam("Rojo", "Argentina");
        equipoNacional.addAtlete(atlete1);
        equipoNacional.addAtlete(atlete2);
        equipoNacional.addAtlete(atlete3);

        for(int i=0;i<equipoNacional.getAtletes().size();i++){
            System.out.println("altura de atleta "+(i+1)+" es: "+equipoNacional.getAtletes().get(i).getHeight());
            if(equipoNacional.getAtletes().get(i).overWeight()){
                System.out.println("El atleta "+(i+1)+" tiene sobre peso");
            }else {
                System.out.println("El atleta "+(i+1)+" no tiene sobre peso");
            }
            System.out.println("+----------------------");
        }
    }
}