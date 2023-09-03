package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

//    @Bean
//    public PacmanGame pacmanGame() {
//        return new PacmanGame();
//    }
//
//    @Bean
//    public SuperContraGame superContraGame() {
//        return new SuperContraGame();
//    }
//
//    @Bean
//    public MarioGame marioGame() {
//        return new MarioGame();
//    }
}

