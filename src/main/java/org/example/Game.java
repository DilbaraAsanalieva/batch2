package org.example;

import java.util.Map;

public class Game {

    public Game(Map<String, Category> gameMap) {
        this.gameMap = gameMap;
    }
    public Game(){}

    private Map<String, Category> gameMap;





    public Map<String, Category> getGameMap() {
        return gameMap;
    }

    public void setGameMap(Map<String, Category> gameMap) {
        this.gameMap = gameMap;
    }
}
