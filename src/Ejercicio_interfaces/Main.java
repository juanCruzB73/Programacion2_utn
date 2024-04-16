package Ejercicio_interfaces;

public class Main {
    public static void main(String[] args) {
      Warrior warrior1 = new Warrior("el guerrero",97,200);
      Magician magician1 = new Magician("el mago",96,130);
      Rogue rogue1 = new Rogue("picaro",95,150);


      duel(warrior1,magician1);
      duel(magician1,rogue1);
      duel(warrior1,rogue1);
    }
    public static void duel(Base_Character warrior1, Base_Character magician1) {
        // Personaje1 ataca a Personaje2
        int damage = warrior1.Attack();
        magician1.Defend(damage);
        System.out.println(warrior1.getName() + " ataca a " + magician1.getName() + " causando " + damage + " de daño.");
        System.out.println(magician1.getName() + " ahora tiene " + magician1.getLifePoint() + " puntos de vida restantes.");
        System.out.println();
    }
}
