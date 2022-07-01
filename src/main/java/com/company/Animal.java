package com.company;

public class Animal {
    public String sound;
    public String name;

    public Animal(String sound, String name) {
        this.sound = sound;
        this.name = name;
    }

    public Animal(String sound) {
        this.sound = sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.sound + "");
    }

    public void getName() {
        System.out.println(this.name + "");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speed() {
        System.out.println("");
    }
}