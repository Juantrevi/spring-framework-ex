package com.spring.springframework.game;

import org.springframework.stereotype.Component;

//@Component
public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("SuperContraGame Jump");
    }

    public void down(){
        System.out.println("SuperContraGame Down into hole");
    }

    public void left(){
        System.out.println("SuperContraGame Stop");
    }

    public void right(){
        System.out.println("SuperContraGame Accelerate");
    }
}
