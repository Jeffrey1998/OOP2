package com.company.animals;

import com.company.DomesticatedAnimal;

public abstract class HomeAnimals extends DomesticatedAnimal {

    public HomeAnimals(String sound, String name) {
        super(sound, name);
    }

    public void walk() {
        System.out.println("Animals in house can usually walk");
    }
}
