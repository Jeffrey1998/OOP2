package com.company.species;

import com.company.animals.HomeAnimals;

public class Cat extends HomeAnimals {
    public Cat(String name) {
        super("miauw", name);
        this.sound = sound;
    }

    @Override
    public double price() {
        return 200;
    }
}
