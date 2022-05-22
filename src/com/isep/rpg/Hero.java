package com.isep.rpg;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero{
    private String role;
    private int lifePoints;
    private int maxLife;
    private int armor;
    private int weaponDamage;
    private int defend;
    private List<Potion> potion;
    private List<Food> lembas;


    public Hero() {
        potion = new ArrayList<>();
        lembas = new ArrayList<>();
    }

    public Hero(String role,int lifePoints, int armor, int weaponDamage) {
        this.role = role;
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
        potion = new ArrayList<>();
        lembas = new ArrayList<>();
    }

    public void eatfood(Food food) {
        int newlife = (lifePoints + food.getEfficiency() );
    }

    public int attack(Enemy enemy) {
        int armor = 0;
        if (enemy instanceof Boss) armor = 20;
        int result = weaponDamage - armor;
        result = Math.max(result, 0);
        enemy.setLifePoints(enemy.getLifePoints() - result);
        return result;
    }

   /*se défendre avec une arme remporte 10 points*/
    public void defend() {
        defend = 10;
    }

    public void useConsumable(Consumable consumable) {
        if (consumable instanceof Food) {
            setLifePoints(((Food) consumable).getEfficiency() + getLifePoints());
        }
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public int getLifePoints() {
        return Math.max(lifePoints, 0);
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public List<Potion> getPotion() {
        return potion;
    }
    public void setPotion(List<Potion> potion) {
        this.potion = potion;
    }

    public List<Food> getLembas() {
        return lembas;
    }
    public void setLembas(List<Food> lembas) {
        this.lembas = lembas;
    }

    public int getDefend() {
        return defend;
    }
    public void setDefend(int defend) {
        this.defend = defend;
    }

}


//public class Hero {
// private List<Food> nourriture;
//private int lifePoints;
//private int maxLifePoints;

// void