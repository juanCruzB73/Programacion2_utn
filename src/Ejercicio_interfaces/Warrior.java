package Ejercicio_interfaces;

public class Warrior extends Base_Character {
    public Warrior(String name, int level, int lifePoint) {
        super(name, level, lifePoint);
    }

    @Override
    public int Attack() {
        return 30;
    }
    @Override
    public void Defend(int damage){
        //El guerrero tiene una mayor resistencia al daño, reduce el daño recibido por la mitad
        super.Defend(damage/2);
    }
}
