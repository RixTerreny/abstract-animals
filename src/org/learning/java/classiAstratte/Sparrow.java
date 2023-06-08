package org.learning.java.classiAstratte;

public class Sparrow extends Animal implements Flyer {
    @Override
    public void doAnimalSound() {
        System.out.println("Chip chip");
    }

    @Override
    public void eat() {
        System.out.println("Lombrichi");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }
}
