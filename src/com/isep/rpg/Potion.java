package com.isep.rpg;

public class Potion implements Consumable{
    private String name;
    private int efficiency;

    public Potion() {
        this.name = "Potion";
        this.efficiency = 40;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEfficiency() {
        return efficiency;
    }
    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

}
