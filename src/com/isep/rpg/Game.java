package com.isep.rpg;

import com.isep.utils.InputParser;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Hero> heroes;
    private List<Enemy> enemies;
    private int playerTurn;
    private InputParser inputParser;



    public void playGame(){
        playerTurn = 1;
    }

    /* genere un ennemi correspondant au héro*/
    public void generateCombat(){
        enemies.clear();
        for (Hero hero : heroes) {
            enemies.add(new BasicEnemy(hero.getRole()));
        }
    }

    public List<Hero> getHeroes() {
        return heroes;
    }
    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }
    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public InputParser getInputParser() {
        return inputParser;
    }
    public void setInputParser(InputParser inputParser) {
        this.inputParser = inputParser;
    }


}
