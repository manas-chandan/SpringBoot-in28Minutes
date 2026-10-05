package com.leranspring.learn_spring_framework;

import com.leranspring.learn_spring_framework.game.GameRunner;
import com.leranspring.learn_spring_framework.game.GamingConsole;
import com.leranspring.learn_spring_framework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole gamingConsole(){
        var game= new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole gamingConsole){
     return new GameRunner(gamingConsole);
    }
}
