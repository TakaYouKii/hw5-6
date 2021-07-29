package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefense("magic");
        boss.setWeapon(new Weapon(" grenade launcher", " RP-26"));


        System.out.println("Boss health:" + boss.getHealth() + "  Boss damage:" + boss.getDamage() + "  Boss defence:" + boss.getDefense() + "  Weapons name:" + boss.weapon.getName() + "  Weapons type:" + boss.weapon.getType());
        for (Hero hero : creatHeroes()) {
            System.out.println("Hero health:" + hero.getHealth() + " Hero damage: " + hero.getDamage() + " Hero superpower: " + hero.getSuperpower());
        }
        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(20);
        skeleton.setHealth(200);
        skeleton.setArrows(15);
        skeleton.setWeapon(new Weapon(" bow", " tt-40 "));
        System.out.println();
        System.out.println(skeleton.pryntInfo());
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(500);
        skeleton1.setWeapon(new Weapon(" bow ", " tr-4 "));
        skeleton1.setArrows(20);

        System.out.println(skeleton1.pryntInfo());

        System.out.println(boss.pryntInfo());
    }

    public static Hero[] creatHeroes() {

        Hero Physical = new Hero(250, 15, "Physical");
        Hero Kinetic = new Hero(230, 10);
        Hero Magical = new Hero(200, 20, "Physical");
        Hero[] heroes = {Physical, Kinetic, Magical};
        return heroes;
    }
}




