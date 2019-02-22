public class main   {

  public static void main (String[] args)
  {

    ChargedParticle firstParticle = new ChargedParticle(9.11e-31, 1);
    firstParticle.setCharge(1.0);
    System.out.println(firstParticle.getCharge());
    System.out.println(firstParticle);
  }
}
