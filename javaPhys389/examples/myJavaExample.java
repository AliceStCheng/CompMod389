/** 
* Purpose: My purpose is to be an example of a Java class with a static method in it.
*          This class randomly tells the user that this class is a good example or a bad example.
*          The number of exclamation marks used in the feedback is configurable.
*          !NOTE! This is a didactic example and hence it has a LOT of comments. Your code should not have as
*          many comments as this. In general, your comments should be there just to add explanatory context - not to paraphrase the code.
* @author Ian Bailey
* @version 1.0
*/ 

// Remember that this is the way we import extra classes into a Java program...
import java.lang.Math;

// The name of the class that contains the main method that we want to run has to
// match the name of the file.
public class myJavaExample { 
	
	 // Set up a class variable that determines how excitable we are.
	 // Higher values imply more excitement and hence more exclamation marks
	 // in feedback (if we think this is a good example).
	static int nExclamation=18; 
		
	/**
	 * This method gives appropriate feedback on the example.
	 * @param exampleGood true if this is a good example, false otherwise.
    	*/
	public static void exampleFeedback(boolean exampleGood)
	{
		// check whether or not this is a good example 
		if (exampleGood){
			// give positive feedback
			System.out.print("What an amazing example");
			for (int i=0; i<nExclamation; i++){
				System.out.print("!");
			}
			System.out.print("\n");
		}
		else
		{
			//give negative feedback
			System.out.println("Unfortunately, this is not a great example. Must do better.");
		}
		return;
				
	}
	
 	/**
	 * Main method - every program needs one of these!
	 * This main method decides whether or not this is a good example and then calls another method to give feedback.
    	*/
    	public static void main (String[] argv) 
	{ 
		// boolean variable corresponding to whether I think this is a good example
		boolean likeExample; 
			
		// variable to decide how easily impressed I am
		double likeThreshold=0.4;
		
		// Randomly decided on whether this is a good example or not		
		if (Math.random()>likeThreshold)
		{	
			likeExample=true;
		}
		else
		{
			likeExample=false;
		}
	
		// give feedback on example
		exampleFeedback(likeExample);
		
	}
		
   
}

