package org.learning.java.classiAstratte;

public class Eagle extends Animal implements Flyer{

    @Override
    public void doAnimalSound() {
        System.out.println("Screech");
    }

    @Override
    public void eat() {
        System.out.println("Carne");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }
}
