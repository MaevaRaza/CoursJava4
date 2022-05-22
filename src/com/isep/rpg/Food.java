package com.isep.rpg;

public class Food implements Consumable{
    private String name;
    private int efficiency;

    public Food() {
        this.name = "lembas";
        this.efficiency = 30;
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

    public void setEffect(int effect) {
        this.efficiency = efficiency;
    }

}



