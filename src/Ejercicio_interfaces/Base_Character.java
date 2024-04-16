package Ejercicio_interfaces;

public abstract class Base_Character implements Character{
    private String name;
    private int level;
    private int lifePoint;

    public Base_Character(String name, int level, int lifePoint) {
        this.name = name;
        this.level = level;
        this.lifePoint = lifePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }
    @Override
    public abstract int Attack();
    @Override
    public void Defend(int damage) {
        lifePoint -= damage;
        if(lifePoint < 0){
            lifePoint = 0;
        }
    }
    }
