package com.isep.rpg;

public class BasicEnemy extends Enemy{
    public BasicEnemy(String role) {
        super(role,50, 0, 5);
    }
/*test cc*/
    @Override
    public String toString() {
        return getRole() +  ":HP " + getLifePoints() + ",armure " + getArmor() + ", arme " + getWeaponDamage();
    }
}
