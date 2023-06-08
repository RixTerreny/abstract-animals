package org.learning.java.classiAstratte;

public class Main {

    public void makeFly(Object animal){
        animal.fly();
    }
    public static void main(String[] args) {
        Dog layla = new Dog();
        Dolphin jonny = new Dolphin();
        Eagle cedrick = new Eagle();
        Sparrow petty = new Sparrow();

        layla.sleep();
        layla.eat();
        jonny.doAnimalSound();
        cedrick.eat();
        petty.doAnimalSound();


    }
}
