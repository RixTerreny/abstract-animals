package org.learning.java.classiAstratte;

public class Dog extends Animal{

    @Override
    public void doAnimalSound() {
        System.out.println("Woof woof");
    }

    @Override
    public void eat() {
        System.out.println("Croccantini");
    }
}
