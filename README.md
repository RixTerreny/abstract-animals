# Animal Kingdom
This program represents the animal kingdom by defining an abstract class and several classes that extend it. It also includes interfaces for flying and swimming animals. The program allows you to instantiate animals, invoke their methods, and demonstrate their specific behaviors.

## Class Hierarchy
- Animale (Abstract class)
 - Cane
 - Passerotto
 - Aquila
 - Delfino
## Animal Methods
The abstract class Animale defines the following methods:

 - dormi(): Displays "Zzz" to indicate sleeping.
 - verso(): Displays the specific sound made by the animal.
 - mangia(): Displays the type of food the animal eats (e.g., grass, meat).
These methods are left abstract in the Animale class and implemented in the subclasses.

## Interfaces
Two interfaces, IVolante and INuotante, are used to represent flying and swimming animals, respectively.

IVolante interface:

vola(): Displays "Sto volando!!!" to indicate flying.
INuotante interface:

nuota(): Displays "Sto nuotando!!!" to indicate swimming.
## Program Usage
The program includes the following methods:

 - faiVolare(IVolante animale): Invokes the vola() method for a flying animal passed as a parameter.
 - faiNuotare(INuotante animale): Invokes the nuota() method for a swimming animal passed as a parameter.
You can create instances of animals that can fly or swim and call the faiVolare or faiNuotare methods, respectively, to demonstrate their corresponding behaviors.

