# Animal Kingdom
This program represents the animal kingdom by defining an abstract class and several classes that extend it. It also includes interfaces for flying and swimming animals. The program allows you to instantiate animals, invoke their methods, and demonstrate their specific behaviors.

## Class Hierarchy
- Animal (Abstract class)
 - Dog
 - Sparrow
 - Eagle
 - Dolphin
## Animal Methods
The abstract class Animale defines the following methods:

 - sleep(): Displays "Zzz" to indicate sleeping.
 - doAnimalSound(): Displays the specific sound made by the animal.
 - eat(): Displays the type of food the animal eats (e.g., grass, meat).
These methods are left abstract in the Animale class and implemented in the subclasses.

## Interfaces
Two interfaces, Flyer and Swimmer, are used to represent flying and swimming animals, respectively.

Flyer interface:

 - fly(): Displays "Sto volando!!!" to indicate flying.
Swimmer interface:

 - swim(): Displays "Sto nuotando!!!" to indicate swimming.
## Program Usage
The program includes the following methods:

 - makeFly(Flyer animal): Invokes the fly() method for a flying animal passed as a parameter.
 - makeSwim(Swimmer animal): Invokes the swim() method for a swimming animal passed as a parameter.

You can create instances of animals that can fly or swim and call the faiVolare or faiNuotare methods, respectively, to demonstrate their corresponding behaviors.

