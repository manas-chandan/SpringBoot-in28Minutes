package com.leranspring.learn_spring_framework.game;

public class GameRunner {
//    MarioGame game;
//private SuperContraGame game;

    private GamingConsole game;
    public GameRunner(GamingConsole gamingConsole) {
        this.game=gamingConsole;
    }

    public void run(){
        System.out.println("Running Game :"+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
