
/**
 * An example of a class representing animals.
 * @author Ian Bailey
 * @version 1.0
 */
 
public class animal{
	// NB Private => only visible inside this class
	// Protected => visible inside this class AND any subclasses
	protected String animalName;
        protected boolean hasFeet;
        protected boolean hasWings;
        protected boolean goesQuack;
        
	/**
	* A Default Constructor. Creates a nameless animal without feet, wings or quacks.
	*/
	public animal(){
		animalName= new String("Nameless");
		hasFeet=false;
		hasWings=false;
		goesQuack=false;
		
	}
    
	/**
	* Constructor with one input
	* Remember that you can have as many constructors as you want. 
	* They all have to have the same name as the class.
	* They all have to have different 'signatures' i.e.
	* they have to have different types of parameters as arguments so that Java knows which constructor method
	* you want to use. This method takes one String as an argument and uses it as the name of the animal.
	* @param name the name of the animal
	*/
	public animal(String name){
		animalName= new String(name);
		hasFeet=false;
		hasWings=false;
		goesQuack=false;
	}
    
	/**
	* Constructor with multiple inputs
        * This method takes one String and three booleans to allow us to configure the name and the physical properties of the animal.
	* @param name the name of the animal
	* @param feetIn true => the animal has feet
	* @param wingsIn true => the animal has wings 
	* @param quackIn true => the animal can quack
	*/
	public animal(String name, boolean feetIn, boolean wingsIn, boolean quackIn){
		animalName= new String(name);
		hasFeet=feetIn;
		hasWings=wingsIn;
		goesQuack=quackIn;
	}
	
	/**
	* Constructor that takes an object of type animal as an argument.
	* This is another common kind of constructor. 
	* A line of code like
	* animal secondAnimal = new animal(firstAnimal);
	* is equivalent to copying or 'cloning' an object
	* so that the contents of the first object is copied into the second object.
	* We'll look at another way of 'cloning' later in 389.
	* @param animalIn the object of type animal that you want to copy
	*/
	public animal(animal animalIn){
		this.animalName=new String(animalIn.animalName);
		this.hasFeet=animalIn.hasFeet;
		this.hasWings=animalIn.hasWings;
		this.goesQuack=animalIn.goesQuack;
	}
	
    
	/**
	* Another common type of method is one that 'gets' some information from inside an object
	* and returns the value. Let's get the name of the animal.
	* @return the name of the animal
	*/
	public String getAnimalName()
	{
		return(animalName);
	}
	

	/**
        * Let's get the feet status of the animal.
	* @return boolean feet status of animal.
	*/
	public boolean getAnimalFeet()
	{
		return(hasFeet);
	}
	
	/**
        * Let's get the wings status of the animal.
	* @return boolean wings status of animal.
	*/
	public boolean getAnimalWings()
	{
		return(hasWings);
	}
	
	/**
        * Let's get the quack status of the animal.
	* @return boolean quack status of animal.
	*/
	public boolean getAnimalQuacks()
	{
		return(goesQuack);
	}
	
	/**
	* Another common type of method is one that 'sets' some information  inside an object
	* after the object has been created. Let's set the name of the animal.
	* @param nameIn the names we want to give the animal.
	*/
	public void setAnimalName(String nameIn)
	{
		animalName=new String(nameIn);
	}
	
	/**
        * Let's give an animal feet or take them away (humanely).
	* @param  feetIn true/false implies the animals has/has not got feet.
	*/
	public void setAnimalFeet(boolean feetIn)
	{
		hasFeet=feetIn;
	}
	
	/**
        * Let's give an animal wings or take them away (humanely).
	* @param  wingIn true/false implies the animals has/has not got wings.
	*/
	public void setAnimalWings(boolean wingIn)
	{
		hasWings=wingIn;
	}
	
	/**
        * Let's give an animal the ability to quack or take it away (humanely).
	* @param  quackOn true/false implies the animals has/has not got the ability to quack.
	*/
	public void setAnimalQuack(boolean quackOn)
	{
		goesQuack=quackOn;
	}
	
	
	/**
	* In addition, you may well have some public methods which themselves use some private methods which can't be accessed
	* directly from outside of the class.
	* The method isn't static so we can use it to update the data inside the object and/or to return a value.
	* In this case we just do the former.
	* This method changes the foot status of the animal depending on the number of feet it has and then updates the animal's name
	* accordingly using a private method.
	* @param numFeet the number of feet the animal has.
	*/
	public void addFeet(int numFeet)
	{
		if (numFeet > 0 ) {
			hasFeet=true;
		}
		else
		{
			hasFeet=false;
		}
		
		nameFeet(numFeet);
		
	}
	
	/**
	* An example of a private method.
	* In this case it changes the name of the animal to suit the number of feet it has - if it has feet.
	* @param numFeet the number of feet the animal has.
	*/
	private void nameFeet(int numFeet)
	{
		String message;
		if (numFeet == 0)
		{
			message="the unfooted."; // no feet
		}
		else if (numFeet>0)
		{
			message="the footed.";  // a positive number of feet
		}
		else
		{
			message="the anti-footed."; // a negative number of feet
		}
			
		animalName=animalName + " " + message;
	}
	
	
	/**
	* Create a string containing information about the object
	* This method is called automatically whenever you have some code like
	* System.out.println(myAnimal);
	* where myAnimal is an object of type animal.
	* @return string with information about the object with form
	* "This object of type animal is called " + name
	*/
	public String toString()
	{
		return "This object of type animal is called " + animalName;
	}
}


