package com.isep.rpg;

public class Mage extends SpellCaster{

    public Mage() {
        super("Mage",60, 0, 5);
        setManaPoints(20);
        getPotion().add(new Potion());
        getLembas().add(new Food());
    }
    public String toString() {
        return getRole() +" : PV " + getLifePoints() + " ,armure " + getArmor() + " ,magie " + getManaPoints()
                + " ,efficacité du sort " + getWeaponDamage()
                + " ,dégâts de l'arme " + getWeaponDamage()
                + " ,quantité de lembas " + getLembas().size();
    }
}
