package com.learning.examples;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Dog dog = new Dog("Wolf", "Small", 100);

        //dog.makeNoise();
        //doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shephard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        for(var animal : animals){
            doAnimalStuff(animal);
        }

    }

    public static void doAnimalStuff(Animal animal)
    {
        animal.makeNoise();
        animal.move("slow");
    }

}