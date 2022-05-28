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
        return getRole() +" : PV " + getLifePoints() + " ,armure " + getArmor()
                + " ,dégâts des flèches  " + getWeaponDamage()+" ,flèche(s) restante(s) "+ arrows
                + " ,quantité de nourriture " + getLembas().size();
    }
}
