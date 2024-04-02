package actividadEnClase19DeMarzo;

public class Main {
    public static void main(String[]args){
        Directivo direct1 = new Directivo("elliot","sepiol");
        System.out.println("Directivo:"+direct1);
        Oficial ofi1 = new Oficial("bash","estampida");
        System.out.println("oficial: "+ofi1);
        Operario oper1=new Operario("Donnie","Darko");
        System.out.println("operario: "+oper1);
        Tecnico tec1 = new Tecnico("lain","iwakura");
        System.out.println("tecnico:"+tec1);
    }
}
