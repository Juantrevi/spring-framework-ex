package com.spring.springframework.game;

import org.springframework.stereotype.Component;

//@Component
public class PacmanGame implements GamingConsole{

    public void up(){
        System.out.println("PacmanGame Jump");
    }

    public void down(){
        System.out.println("PacmanGame Down into hole");
    }

    public void left(){
        System.out.println("PacmanGame Stop");
    }

    public void right(){
        System.out.println("PacmanGame Accelerate");
    }
}
