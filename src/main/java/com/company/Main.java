package com.company;

import com.company.exceptions.incorrectFilenameException;
import com.company.food.Dogfood;
import com.company.species.*;
import io.javalin.Javalin;

import java.io.*;
import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.Boolean.parseBoolean;

public class Main {
    public static void main(String[] args) throws IOException {
//      Create javalin instance
        Javalin app = Javalin.create().start(3000);

        // random animals
        Dog dog = new Dog("Lucky");
        Dog dog2 = new Dog("Senna");
        Cat cat = new Cat("Kitty");
        Turtle turtle = new Turtle();
        Frog frog = new Frog();
        Eagle eagle = new Eagle("Birdy");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Lucky"));
        animals.add(new Dog("Senna"));
        animals.add(new Cat("Kitty"));
        animals.add(new Turtle());
        animals.add(new Frog());
        animals.add(new Eagle("Birdy"));

        Dog[] dogs = new Dog[] {
                dog, dog2
        };

        ArrayList inventory = new ArrayList<isSellable>();
        inventory.add(new Dogfood());

        System.out.println("All animals with name");
        Predicate<Animal> animalHasName = animal -> !parseBoolean(animal.getName());

//      Refactored to stream
//      Returns all animals that make a sound, that's found in the list
        List<Animal> animalsThatMakeSound = animals.stream()
                .filter(animal -> animal.makeSound() != null)
                .filter(animalHasName)
                .collect(Collectors.toList());

        animalsThatMakeSound.forEach(animal -> System.out.println(animal.makeSound()));

        System.out.print("Print all animals using consumer");
//      Consumer that prints out all the animals
        Consumer<Animal> c = System.out::println;
        animals.forEach(c);

        // Dogs have the same property as cats
        System.out.println("\nAll dogs have a name: ");
        for (Animal e: dogs) {
            e.getName();
        }

        // print all objects that have been added to inventory
        System.out.println("\nprint all objects that have been added to inventory");
        for (Object item: inventory) {
            System.out.println(item);
        }

        File file = new File("available.txt");
        app.post("/upload", ctx -> {
            try {

            } catch (Exception e) {

            }
        });

        app.get("/", ctx -> {
            try {
                // stream, streamReader en buffer om file uit te lezen
                FileInputStream fis = new FileInputStream("available.txt");
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);

                if (file.exists()) {
                    ctx.result(reader.lines().collect(Collectors.joining()) + "\n");
                } else {
                    throw new incorrectFilenameException("incorrect filename");
                }
            }catch (incorrectFilenameException err){
                System.out.println("something went wrong");
                throw err;
            }
        });
    }
}
