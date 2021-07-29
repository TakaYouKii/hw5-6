package com.company;

public class Boss extends GameEntity {
    public Boss() {
    }

    private String defense;


    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }


    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(String defense, Weapon weapon, int health) {
        this.health = health;
        this.defense = defense;
        this.weapon = weapon;

    }

    @Override
    public String pryntInfo(){
        return health + weapon.getType() + weapon.getName();
    }
}
