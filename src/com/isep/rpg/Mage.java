package com.isep.rpg;

public class Mage extends SpellCaster{

    public Mage() {
        super("Mage",60, 0, 5);
        setManaPoints(20);
        getPotion().add(new Potion());
        getLembas().add(new Food());
    }
    public String toString() {
        return getRole() +" :HP " + getLifePoints() + " ,armure " + getArmor() + " ,magic " + getManaPoints()
                + " ,magic attack " + getWeaponDamage()
                + " ,amount of food " + getLembas().size()
                + " ,amount of potion " + getPotion().size();
    }
}
