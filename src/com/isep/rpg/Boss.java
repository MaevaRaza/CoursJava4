package com.isep.rpg;

public class Boss extends Enemy{
    public Boss() {
        super("Boss",500, 20, 30);
    }

    @Override
    public String toString() {
        return  getRole() + ":HP " + getLifePoints() + ",armure " + getArmor() + ", arme " + getWeaponDamage();
    }
}
