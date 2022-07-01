package com.company;

public abstract class DomesticatedAnimal extends Animal{
    public DomesticatedAnimal(String sound, String name) {
        super(sound, name);
    }

    public abstract double price();

    public String toString() {
        return String.format(super.toString(), "Domesticated");
    }
}
