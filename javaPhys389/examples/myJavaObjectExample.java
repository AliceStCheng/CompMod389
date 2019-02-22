/**
* Purpose: My purpose is to be an example of creating instances of a Java class, using non-static methods
*          and to explore the pitfalls of 'copying' objects.
*          This class makes an array of 'example' objects and give feedback on each example. It then makes a 'copy' of
*          the array, alters the contents and shows that we've changed the first array too... Oops.
*          Note that this is also an example of a file containing multiple classes.
*          Note that this class deliberately contains many more comments than you would use in normal coding...
* @author Ian Bailey
* @version 1.0
*/

// Remember that this is the way we import extra classes into a Java program...
import java.lang.Math;

// The name of the class that contains the main method that we want to run has to
// match the name of the file.
public class myJavaObjectExample {


 	/**
	 * Main method - every program needs one of these!
	 * This main method generates and gives feedback on example objects...
    	*/
    	public static void main (String[] argv)
	   	{
			// number of example objects to make
			int nObjects=3;

			// make an array of example objects
			example [] myExamples = new example[nObjects];

			for(int i=0; i<nObjects; i++){
				myExamples[i]=new example(i);
				// all of my examples are good!
				myExamples[i].setGood(true);
			}

			// print out feedback for each example
			System.out.println("First array");
			for(int i=0; i<nObjects; i++){
				System.out.print(myExamples[i].exampleFeedback());
			}

			// make another array of example objects
			example [] myOtherExamples = new example[nObjects];

			// 'copy' the first array
			for(int i=0; i<nObjects; i++){
				myOtherExamples[i]= new example(myExamples[i]); // The important line. What is being copied here?
			}

			// The examples in the second array are bad...
	    for(int i=0; i<nObjects;i++){
	    	myOtherExamples[i].setGood(false);
	    }

	    // print out feedback for each example in the second array
	    System.out.println("\n\nSecond array");
			for(int i=0; i<nObjects; i++){
				System.out.print(myOtherExamples[i].exampleFeedback());
			}

// print out feedback for each example in the first array
    System.out.println("\n\nThe first array again");

		for(int i=0; i<nObjects; i++){
		System.out.print(myExamples[i].exampleFeedback());
		}
		System.out.println("\n\n The moral is - be careful how you 'copy'!");

		// Why did this happen?
		// We need to make a distinction between an Object (which is an instance of a class)
		// and the reference to an Object (which is the variable name)
		//
		// E.g. Consider the line Vector myVector;
		// This tells the Java compiler that you want the name 'myVector' to refer to an object of type Vector.
		// It DOESN'T create that object.
		// myVector is a 'reference' to a Vector object but it currently isn't associated with a specific Vector object.
		//
		// Now we can create a Vector object and set myVector so that it refers to that Vector object
		// E.g. myVector = new Vector();
		//
		// If I now make a second reference to a Vector
		// E.g. Vector myVector2;
		// I can either make a new Vector object and associate the reference 'myVector2' with that object
		// E.g. myVector2 = new Vector();
		//
		// OR I could make it refer to the Vector object we had already made
		// E.g. myVector2 = myVector1;
		//
		// In this second case BOTH of the references myVector1 and myVector2 refer to the SAME Vector object
		 // (i.e. they both refer to exactly the same place in the computer's memory)
		// Therefore if you use a method such as
		// E.g. myVector1.scale(5.0) which changes the values of the data members stored inside the object referred to by myVector1
		// you have also changed the value of the data members referred to by myVector2
		// This has to be true because myVector1 and myVector2 refer to the SAME object!
		//
		//
		// If you want to make a COPY of an object then you need to use a copy constructor
		// E.g. myVector2 = new Vector(myVector1);
		// Now myVector2 and myVector1 refer to DIFFERENT objects.
		//
		// The values stored in the data members of the two objects are currently the same (that's what we mean by 'copy'!)
		//
		// However if I now change the contents of the data members in one object this will have no effect on the other object.
		// E.g. myVector1.scale(5.0); will scale the vector associated with myVector1
		// but this will have no effect on the vector associated with myVector2
		// because the two references myVector1 and myVector2 are referring to DIFFERENT places in the computer's memory.


	}


}

/**
* Purpose: My purpose is to be just to be an example of a class that we can make objects from.
*
* @author Ian Bailey
* @version 1.0
*/
class example{

	// Our example object can contain some data members...
	// in this case there is an integer
	// that determine how excited we should be about this object.
	// Higher values imply more excitement and hence more exclamation marks
	// in feedback.
	int nexclamation;
	// ...and there is a boolean variable that determines whether this is a good example or not.
	boolean goodExample;

	// Our example object can contain some methods...

	/**
	* A Default Constructor. Set everything to zero...
	* Remember that constructors have to have the same name as the class, and have no return type (not even void).
	*/
	public example(){
		nexclamation=0;
		goodExample=false;
	}

	/**
	* A constructor that configures the excitement associated with this object
	* @param inExclamation the level of excitment
	*/
	public example(int inExclamation){
		nexclamation=inExclamation;
		goodExample=false;
	}

	/**
	* A constructor that configures the excitement associated with this object and sets the example to be good or bad
	* @param inExclamation the level of excitement
	* @param inGood whether or not the example is good
	*/
	public example(int inExclamation, boolean inGood){
		nexclamation=inExclamation;
		goodExample=inGood;
	}

public example(example myOtherExample){
    nexclamation=myOtherExample.nexclamation;
    goodExample=myOtherExample.goodExample;
}
	/**
	* A setter to set the excitement associated with this object
	* @param inExclamation the level of excitement
	*/
	public void setExcitement(int inExclamation){
		nexclamation=inExclamation;
	}


	/**
	* A setter to set the 'good' status of this object
	* @param inGood whether or not the example is good
	*/
	public void setGood(boolean inGood){
		goodExample=inGood;
	}

	/**
	* A getter to get the excitement associated with this object
	* @return the level of excitement
	*/
	public int getExcitement(){
		return nexclamation;
	}

	/**
	* A getter to get the good status of this object
	* @return if true then the example if good (bad otherwise)
	*/
	public boolean getGood(){
		return goodExample;
	}


	/**
	 * This method gives appropriate feedback on the example.
	 * @return a String containing example feedback
    	*/
	public String exampleFeedback()
	{
		String commentString;
		// check whether or not this is a good example
		if (goodExample){
			// give positive feedback
			commentString="What an amazing example";
			for (int i=0; i<nexclamation; i++){
				commentString+="!";
			}
			commentString+=("\n");
		}
		else
		{
			//give negative feedback
			commentString="Unfortunately, this is not a great example. Must do better.\n";
		}
		return commentString;

	}

}
