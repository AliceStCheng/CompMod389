/**
 * A Class with a simple main method for demonstrating inheritance using the hamster and animal classes.
 *
 * @author Ian Bailey
 * @version 1.0
 */

 public class InheritanceAnimalExample  {
        /**
        * Main method to demonstrate inheritance.
        */
   	 public static void main (String[] args)
   	 {

		animal firstAnimal = new animal("Blob"); // make an animal object
		hamster firstHamster = new hamster("Gary", 2); // make a hamster object
    hamster anotherHamster = new hamster("Gavin", 4);

		System.out.println("Using the toString method in the first hamster object we get:");
		System.out.println(firstHamster);
		System.out.println();
		System.out.println("Using the toString method in the first animal object we get:");
		System.out.println(firstAnimal);

		hamster secondHamster = new hamster(firstHamster); // make a copy of firstHamster

		System.out.println();
		System.out.println("Using the toString method in the second hamster object we get:");
		System.out.println(secondHamster);
		System.out.println();

		firstHamster.incrementWheels(3); //update the number of wheels owned by firstHamster

		System.out.println("After firstHamster.incrementWheels:");
		System.out.println("Using the toString method in the first hamster object we get:");
		System.out.println(firstHamster);
		System.out.println();
		System.out.println("Using the toString method in the first animal object we get:");
		System.out.println(firstAnimal);

		System.out.println();
		System.out.println("Note that the copy of firstHamster we made hasn't changed:");
		System.out.println(secondHamster);
		System.out.println();

		firstAnimal.addFeet(1); //update firstAnimal using the addFeet method

		System.out.println("After firstAnimal.addFeet:");
		System.out.println("Using the toString method in the first hamster object we get:");
		System.out.println(firstHamster);
		System.out.println();
		System.out.println("Using the toString method in the first animal object we get:");
		System.out.println(firstAnimal);
		System.out.println();

		// hamster inherits from the animal class, so we access the animal methods
		firstHamster.addFeet(-4); //update firstHamster using the addFeet method
		System.out.println("After firstHamster.addFeet:");
		System.out.println("Using the toString method in the first hamster object we get:");
		System.out.println(firstHamster);
		System.out.println();
		System.out.println("Using the toString method in the first animal object we get:");
		System.out.println(firstAnimal);
		System.out.println();

		return;

	 }

}
