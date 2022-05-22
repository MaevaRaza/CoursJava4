package com.isep.rpg;

public abstract class Enemy {
    private String role;
    private int lifePoints;
    private int armor;
    private int weaponDamage;

    public Enemy() {
    }

    public Enemy(String role,int lifePoints, int armor, int weaponDamage) {
        this.role = role;
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
    }
    public String getRole() {
        return role;
    }
    public void setName(String name) {
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
}
