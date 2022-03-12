package com.isep.rpg;

import java.util.List;

public abstract class Hero{
    private boolean lifePoints;
    private int maxLife;
    private String armor;
    private String weaponDamage;
    private List<Potion> potion;
    private List<Food> lembas;

    public void attack() {

    }public void setLifePoints(int points){
        this.lifePoints = (points > maxLife);

    }
    public abstract void defend();
    public void useConsumable(Consumable consumable){
    if (consumable.increaseHealth()) {
        setLifePoints(lifePoints + consumable.getValue());
    }

    }

}
