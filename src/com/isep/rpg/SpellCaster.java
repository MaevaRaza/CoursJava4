package com.isep.rpg;

public abstract class SpellCaster extends Hero{
    private int manaPoints;

    public SpellCaster(String role,int lifePoints, int armor, int weaponDamage) {
        super(role,lifePoints, armor, weaponDamage);
    }

    public void useConsumable(Consumable consumable) {
        if (consumable instanceof Food) {
            setLifePoints(((Food)consumable).getEfficiency()+getLifePoints());
        }else if (consumable instanceof Potion) {
            setManaPoints(((Potion)consumable).getEfficiency()+getManaPoints());
        }
    }

    public int getManaPoints() {
        return manaPoints;
    }
    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }
}

