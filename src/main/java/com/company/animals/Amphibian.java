package com.company.animals;

import com.company.Animal;

public class Amphibian extends Animal {
    public Amphibian(String sound) {
        super(sound);
    }

    public void walk() {
        System.out.println("The Amphibian can walking");
    }

}
