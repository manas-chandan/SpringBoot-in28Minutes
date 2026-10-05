package com.leranspring.learn_spring_framework;

import com.leranspring.learn_spring_framework.game.GameRunner;
import com.leranspring.learn_spring_framework.game.SuperContraGame;

public class App01GamiingBasicJava {
    public static void main(String[] args){
//        var marioGame =new MarioGame();

//        var superContraGame = new SuperContraGame();

//        var game =new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
