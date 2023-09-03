package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jumping up");
    }

    @Override
    public void down() {
        System.out.println("Going into a hole");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Accelerate");
    }
}
