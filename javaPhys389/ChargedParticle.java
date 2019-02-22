public class ChargedParticle extends Particle{

  protected double charge;
  private double e = 1.6e-19;

  public ChargedParticle()
  {
    super();
    charge = 0*e;
  }

  public ChargedParticle(double newMass, double newCharge)
  {
    super(newMass);
    charge = newCharge*e;
  }

  public ChargedParticle(double newMass, double newCharge,
                        PhysicsVector newPos, PhysicsVector newVel)
  {
    super(newMass, newPos, newVel);
    charge = newCharge*e;
  }

  public ChargedParticle(ChargedParticle firstParticle)
  {
    //super((Particle)firstParticle);
    this.mass  = firstParticle.mass;
    this.position = new PhysicsVector(firstParticle.position);
    this.velocity = new PhysicsVector(firstParticle.velocity);
    this.acceleration = new PhysicsVector(firstParticle.acceleration);
    this.charge = firstParticle.charge;
  }

  public double getCharge()
  {
    return(charge);
  }

  public void setCharge(double newCharge)
  {
    charge = (newCharge*e);
  }

  public String toString()
   {
     return "Charge: " + charge + "e " + super.toString();
   }

}
