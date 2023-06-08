package org.learning.java.classiAstratte;

public class Main {

    public static void makeFly(Flyer animal){
        animal.fly();
    }

    public static void makeSwim(Swimmer animal){
        animal.swim();
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

        makeFly(cedrick);
        makeFly(petty);
        makeSwim(jonny);
    }
}
