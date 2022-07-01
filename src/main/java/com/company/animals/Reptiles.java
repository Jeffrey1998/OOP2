package com.company.animals;

import com.company.Animal;

public class Reptiles extends Animal {
    public Reptiles(String sound) {
        super(sound);
    }

    public void walk () {
        System.out.println("The reptile can walk");
    }
}