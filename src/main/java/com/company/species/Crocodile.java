package com.company.species;

import com.company.animals.Reptiles;

class Crocodile extends Reptiles {
    public String name;
    public Crocodile(String name) {
        super("grunt");
        this.name = name;
    }
}
