package com.company;

import com.company.controllers.AvaiableAnimalsController;
import com.company.food.Dogfood;
import com.company.species.*;
import io.javalin.Javalin;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.stream.Collectors;

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

        Animal[] animals = new Animal[] {
                dog, cat, turtle, frog, eagle, dog2
        };

        Dog[] dogs = new Dog[] {
                dog, dog2
        };


        ArrayList inventory = new ArrayList<isSellable>();
        inventory.add(new Dogfood());

        System.out.println("All classes in the list");

        for (Animal animal: animals ){
            animal.makeSound();

            // instanceOf declaration
            if (animal instanceof isSellable) {
                // cast
                // as soon as an animal in the array of animals has the declaration of isSellable it gets added to
                // inventory
                inventory.add((isSellable)animal);
            }
        }

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

        app.get("/", AvaiableAnimalsController::getAvailableAnimals);

//        create file
//        File file = new File("available.txt");
//        FileWriter fw = new FileWriter(file);
//        PrintWriter pw = new PrintWriter(fw);
//
//        for(int i = 0; i<10; i++) {
//            pw.append(AvaiableAnimalsController::getAvailableAnimals);
//        }
//        pw.close();

        app.get("/", ctx -> {
            // stream, streamReader en buffer om file uit te lezen
            FileInputStream fis = new FileInputStream("available.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);

            // geef alle regels van de file terug
            ctx.result(reader.lines().collect(Collectors.joining()) + "\n");
        });
    }
}
