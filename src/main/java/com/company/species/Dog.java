package com.company.species;

import com.company.animals.HomeAnimals;

public class Dog extends HomeAnimals {

    public Dog(String name) {
        super("woof", name);
    }

    @Override
    public double price() {
        return 200;
    }
}
