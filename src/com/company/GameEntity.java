package com.company;

public class GameEntity {
    protected int health;
    protected   int damage;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String pryntInfo(){
        return health + " " + damage;
    }

}
