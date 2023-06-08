package org.learning.java.classiAstratte;

public class Eagle extends Animal{

    @Override
    public void doAnimalSound() {
        System.out.println("Screech");
    }

    @Override
    public void eat() {
        System.out.println("Carne");
    }
}
