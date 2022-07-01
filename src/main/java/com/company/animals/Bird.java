package com.company.animals;

import com.company.Animal;

public class Bird extends Animal {
    public int speed;

    public Bird(String sound, int speed) {
        super(sound);
        this.speed = speed;
    }

    public void fly() {
        System.out.println("The bird can fly");
    }
}
