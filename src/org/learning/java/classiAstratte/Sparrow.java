package org.learning.java.classiAstratte;

public class Sparrow extends Animal {
    @Override
    public void doAnimalSound() {
        System.out.println("Chip chip");
    }

    @Override
    public void eat() {
        System.out.println("Lombrichi");
    }
}
