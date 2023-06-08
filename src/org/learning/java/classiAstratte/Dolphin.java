package org.learning.java.classiAstratte;

public class Dolphin extends  Animal implements Swimmer{
    @Override
    public void doAnimalSound() {
        System.out.println("ih ih ihihihihi");
    }

    @Override
    public void eat() {
        System.out.println("Pesce");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando");
    }
}
