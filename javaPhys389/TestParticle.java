/**
 * A Class to test the Particle with uniform gravitational acceleration. 
 * We assume that the 'ground' is at y=0.
 * @author Ian Bailey
 * @version 1.0
 */

 public class TestParticle  {
        
   	 public static void main (String[] args) 
   	 {

   	 	double pMass=1.0; // particle mass in kg
   	 	double pSpeed = 10.0; // initial speed of particle in ms^-1
   	 	PhysicsVector pDirn = new PhysicsVector(1,1,0); // initial direction of particle motion
   	 	PhysicsVector pOrigin= new PhysicsVector(0,0,0); // initial position of particle
   	 	
   	 	double gMag=9.81; // magnitude of gravitational acceleration
   	 	PhysicsVector gDirn = new PhysicsVector(0,-1,0); // direction of gravitational acceleration
   	 	
   	 	double timeStep=0.00001; // time step in seconds
   	 	double maxTime=100000000; // maximum simulation time in seconds
   	 	
		Particle ball = new Particle(pMass);
		PhysicsVector gravity = PhysicsVector.scale(gMag, gDirn.getUnitVector()); 
		
		ball.setVelocity(PhysicsVector.scale(pSpeed, pDirn.getUnitVector())); //set particle velocity
		ball.setPosition(pOrigin); // set particle position
		    
		double time=0.0; // reset simulation time
		    
		    while((ball.getPosition().getY()>=0.0) && time < maxTime){// Loop over time until ball hits the ground
		    	   time+=timeStep;
		    	   ball.update(timeStep, gravity);
		    }
		    

		    System.out.println("Maximum horizontal displacement is " + (ball.getPosition()).getX() + " m ");
	 }
 }
	 

