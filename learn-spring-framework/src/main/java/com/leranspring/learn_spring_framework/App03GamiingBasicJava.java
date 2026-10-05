package com.leranspring.learn_spring_framework;

import com.leranspring.learn_spring_framework.game.GameRunner;
import com.leranspring.learn_spring_framework.game.GamingConsole;
import com.leranspring.learn_spring_framework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamiingBasicJava {
    public static void main(String[] args){

    try(var context =  new AnnotationConfigApplicationContext(GamingConfiguration.class)){

        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
//        var marioGame =new MarioGame();

//        var superContraGame = new SuperContraGame();

//        var game =new MarioGame();
//        var game = new SuperContraGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }
}
