package com.isep;

import com.isep.rpg.Game;
import com.isep.rpg.Hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //choix nb de heros
        Game g = new Game();
        int nb = g.setHeroes();

        Scanner sc = new Scanner (System.in);
        System.out.println("Choisis le nombre de héros");
        nb = sc.nextInt();

        //choix de la classe de chaque heros
        //peut etre Hunter, Mage, Healer, Warrior
        Hero hero = new Hero(" ");
        String role = hero.getRole();
        System.out.println("    Heros : "+hero.getRole());
        role = sc.next();

        //ordre d'attaque aleatoire

        // implémentation des combats puis combat => boucle

        //dmd aux joueurs ce qu'ils souhaitent faire
        System.out.println("Que souhaites-tu faire ?");
        // => augmenter son armure
        // => augmenter dégats de son arme
        // => augmenter efficacité potion + nourriture
        // => augmenter nombre potion ou nourriture
        // => augmenter nombre fleche hunter
        //diminue cout mana spellcaster

        }
    }

