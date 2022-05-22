package com.isep.rpg;

public class Warrior extends Hero {
    public Warrior() {
        super("Warrior", 100, 0, 100);
        getPotion().add(new Potion());
        getLembas().add(new Food());
    }

    public String toString() {
        return getRole() + " :HP " + getLifePoints() + " ,armure " + getArmor()
                + " ,Axe attack power " + getWeaponDamage()
                + " ,amount of food " + getLembas().size();
    }
}
