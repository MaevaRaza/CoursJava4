package com.isep.rpg;

public class Hunter extends Hero {
    private int arrows;

    public Hunter() {
        super("Hunter", 60, 0, 5);
        this.arrows = 20;
        getPotion().add(new Potion());
        getLembas().add(new Food());
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    @Override
    public String toString() {
        return getRole() +" :HP " + getLifePoints() + " ,armure " + getArmor()
                + " ,Arrow attack power " + getWeaponDamage()+" number of arrows "+ arrows
                + " ,amount of food " + getLembas().size();
    }
}
