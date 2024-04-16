package Ejercicio_interfaces;

public class Rogue extends Base_Character {
    public Rogue(String name, int level, int lifePoint) {
        super(name, level, lifePoint);
    }

    @Override
    public int Attack() {
        return 15;
    }

    @Override
    public void Defend(int damage) {

        if (Math.random() < 0.5) {
            System.out.println("¡El Picaro ha evadido el ataque!");

        } else {
            super.Defend(damage);
        }
    }
}



