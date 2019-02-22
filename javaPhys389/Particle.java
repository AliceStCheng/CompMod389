
/**
 * A Class to represent a massive particle
 *  It can have position, velocity, acceleration and mass
 * @author  Alex Finch
 * @author Ian Bailey
 * @version 1.5
 */
public class Particle{

	protected double mass; //the mass of the particle
	protected PhysicsVector position, velocity, acceleration;

	/**
	* The Default Constructor. Sets everything to zero.
	*
	*/
	public Particle(){
		mass = 0;
		position = new PhysicsVector();
		velocity = new PhysicsVector();
		acceleration= new PhysicsVector();
	}

	/**
	* Constructor with one input, the mass of the particle. Set everything else to zero.
	* @param mIn mass of the particle
	*/
	public Particle(double mIn){
		mass = mIn;
		position = new PhysicsVector();
		velocity = new PhysicsVector();
		acceleration= new PhysicsVector();
	}

	/**
	*  Constructor that sets mass, position and velocity
	*  @param mIn mass of the particle
	*  @param positionIn initial position of particle
	*  @param velocityIn initial velocity of particle
	*/
	public Particle(double mIn,PhysicsVector positionIn,PhysicsVector velocityIn)
	{
		mass = mIn;
		position = new PhysicsVector(positionIn);
		velocity = new PhysicsVector(velocityIn);
		acceleration= new PhysicsVector();
	}


	/**
	* Return the position
	*
	* @return position
	*/
	public PhysicsVector getPosition()
	{
		return new PhysicsVector(position);
	}

	/**
	* Return the velocity
	*
	* @return velocity
	*/
	public PhysicsVector getVelocity()
	{
		return new PhysicsVector(velocity);
	}

	/**
	* Return the acceleration
	*
	* @return acceleration
	*/
	public PhysicsVector getAcceleration()
	{
		return new PhysicsVector(acceleration);
	}


	/**
	* Return the mass
	*
	* @return mass
	*/
	public double getMass()
	{
		return mass;
	}

	/**
	* Set the mass
	*
	* @param massIn The new mass
	*/
	public void setMass(double massIn)
	{
		mass=massIn;
	}

	/**
	* Set the position
	*
	* @param pIn The new position
	*/
	public void setPosition(PhysicsVector pIn)
	{
		position = new PhysicsVector(pIn);
		return;
	}


	/**
	* Set the velocity
	*
	* @param vecIn The new velocity
	*/
	public void setVelocity(PhysicsVector velocityIn)
	{
		velocity = new PhysicsVector(velocityIn);
		return;
	}

	/**
	* Set the acceleration
	*
	* @param accIn The new acceleration
	*/
	public void setAcceleration(PhysicsVector accIn)
	{
		acceleration= new PhysicsVector(accIn);
		return;
	}


	/**
	* Update the position and velocity of the particle subject to a constant acceleration for a time.
	* After the time has passed the acceleration reverts to its previous value.
	*
	* @param deltaTime  The change in time
	* @param accelIn    The applied acceleration
	*/
	public void update(double deltaTime, PhysicsVector accelIn)
	{
		PhysicsVector savedAcceleration = acceleration;

		// apply the new acceleration for a short time
		acceleration = new PhysicsVector(accelIn);
		update(deltaTime);

		// revert acceleration to previous value
		acceleration = savedAcceleration;

		return;
	}

	/**
	* Update the position and velocity of the particle after a short time has
	* passed when the particle is experiencing the acceleration stored in the class.
	* Applies the formula s = ut + 1/2 at**2 to the position
	* Applies the formula v=u+at to the velocity
	* @param deltaTime  The change in time
	*/
	public void update(double deltaTime)
	{
		position.increaseBy(PhysicsVector.scale(deltaTime, velocity)); // old position + ut
		position.increaseBy(PhysicsVector.scale(0.5*deltaTime*deltaTime, acceleration)); // + 1/2 at**2

		velocity.increaseBy(PhysicsVector.scale(deltaTime, acceleration)); // v = u + at
		return;

	}

	/**
	* Create a string containing the mass, position, velocity, and acceleration of the particle.
	* This method is called automatically by System.out.println(someparticle)
	* @return string with the format
	* " mass "+mass+" Position: "+position+" Velocity: "+velocity+" Acceleration: "+acceleration
	*/
	public String toString()
	{
		return " Mass: "+mass+" Position: "+position.returnSimpleString()+" Velocity: "+velocity.returnSimpleString()+" Acceleration: "+acceleration.returnSimpleString();
	}
}
