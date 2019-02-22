
/**
 * An example of a subclass which uses inheritance to extend the animal class.
 *
 * @author Ian Bailey
 * @version 1.0
 */
 
public class hamster extends animal{
	
	private int numWheels; // the number of wheels belonging to the hamster
    
	/**
	* A Default Constructor to set up a default hamster.
	* Remember that constructors have to have the same name as the class, and have no return type.
	* The subclass can access a constructor for the superclass using the keyword 'super'.
	*/
	public hamster(){
		super("Hamtaro", true, false, false); // make an object of the superclass type (animal)
		                                      // as part of this subclass object (hamster).
		                                      // This line has to come first in the constructor!
		numWheels=0;
		
	}
    
	/**
	* A general constructor to make a named hamster with a certain number of wheels.
	* @param hamName the hamster's name.
	* @param inWheels the number of wheels
	*/
	public hamster(String hamName, int inWheels ){
		numWheels=inWheels;
		animalName= new String(hamName); // we can access the superclass variable animalName
		                                 // from here in the subclass because it was declared as 'protected' not 'private'
		/* super.animalName=new String(hamName); would work too */
	}
    
	/**
	* Constructor that takes an object of type hamster as an argument.
	* This is another common kind of constructor. 
	* Lines of code like
	* hamster firstHamster = new hamster();
	* hamster secondHamster = new hamster(firstHamster);
	* is equivalent to copying or 'cloning' the first object (firstHamster)
	* so that the contents of the first object are copied into the second object.
	* We'll look at another way of 'cloning' later in phys389.
	* @param firstHamster the hamster object we want to copy
	*/
	public hamster(hamster firstHamster){
		super(firstHamster.animalName, firstHamster.hasFeet, firstHamster.hasWings, firstHamster.goesQuack); // actually this is rather long-winded. 
		                                                                                                     // We could use 'polymorphism' here
		                                                                                                     // More on this later...
		this.numWheels=firstHamster.numWheels; 
	}
	
    
	/**
	* Another common type of method is one that 'gets' some information from inside an object
	* and returns the value.
	* @return the value of subclassVariable
	*/
	public double getWheels()
	{
		return(numWheels);
	}
	

	/**
	* Another common type of method is one that 'sets' some information  inside an object
	* after the object has been created.
	* @param inWheels the number of wheels owned by the hamster
	*/
	public void setSubclassVariable(int inWheels)
	{
		numWheels=inWheels;
	}
	
	
	/**
	* Increment the number of wheels the hamster has.
	* @param deltaWheels the amount of wheels the hamster is gaining.
        */
        
	public void incrementWheels(int deltaWheels)
	{
		numWheels+=deltaWheels; 
	}
	
	
	/**
	* Return a string containing information about the object
	* This method is called automatically whenever you have some code like
	* System.out.println(myHamster);
	* where myHamster is an object of type hamster.
	* We can access the toString method in the superclass (animal) using 'super'
	* @return string with information about the hamster with form
	* "This hamster has " + numWheels + "wheels\n" + super.toString()
	*/
	public String toString()
	{
		return "This hamster has " + numWheels + " wheels\n" + super.toString();
	}
}


