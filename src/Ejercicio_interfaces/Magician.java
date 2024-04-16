package Ejercicio_interfaces;

public class Magician extends Base_Character{
    public Magician(String name, int level, int lifePoint) {
        super(name, level, lifePoint);
    }

    @Override
    public int Attack() {
        return 20;
    }
    @Override
    public void Defend(int damage){
        super.Defend((int) (damage * 0.8));
    }
}
