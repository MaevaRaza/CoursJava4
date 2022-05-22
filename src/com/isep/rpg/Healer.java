package com.isep.rpg;

public class Healer extends SpellCaster{
    public Healer() {
        super("Healer", 100, 0, 10);
        setManaPoints(30);
        getPotion().add(new Potion());
        getLembas().add(new Food());
    }

    public boolean heal(Hero hero) {
        int manaPoints = getManaPoints();
        if (manaPoints > 10) {
            //mauvais sort
            setManaPoints(manaPoints - 10);
            //un hero guéri gagne 10 hp
            hero.setLifePoints(hero.getLifePoints() + 10);
            return true;
        }
        //si la guerison a échoué
        return false;
    }
    public String toString() {
        return  getRole() +" :HP " + getLifePoints() + " ,armure " + getArmor()+ " ,magic " + getManaPoints()
                + " ,arme " + getWeaponDamage()
                + " ,amount of food " + getLembas().size()
                + " ,amount of potion " + getPotion().size();
    }
}
