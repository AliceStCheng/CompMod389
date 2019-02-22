/**
 * Objects created from this class behave like
 * complex numbers.  Private variables are used to demonstrate good
 * programming practice.
 * 
 * A complex number represented by (a + bi)
 *
 * @author Iain A. Bertram
 * @author Roger Jones
 * @author Ian Bailey
 * @version 2012-v1
 */

public class Complex
{
    // private class variables
    private double realpart;
    private double imagpart;

    /**
     * Default constructor, real and imaginary parts are initialised to zero.
     * 
     * (0 + 0i)
     */
    public Complex()
    {
        realpart = 0;
        imagpart = 0;
        return;
    }

    /**
     * Constructor that sets the complex number to (x + yi)
     *
     * @param x the real part of the complex number
     * @param y the imaginary part of the complex number
     */
    public Complex(double x, double y)
    {
        realpart = x;
        imagpart = y;
        return;
    }
    
     /**
     * Method to set the real and imaginary parts of the complex number
     * @param x the real part of the complex number
     * @param y the imaginary part of the complex number
     */
    public void setComplex(double x, double y)
    {
        realpart = x;
        imagpart = y;
    }
    
    /**
     * method to find out value of real part
     * @return the real part of the complex number
     */
    public double getReal()
    {
        return realpart;
    }

    /**
     *method to find out value of imaginary part
     * @return the imaginary component of the complex number
     */
    public double getImag()
    {
        return imagpart;
    }


    /** 
     * method to add complex "z" to this object
     * 
     * complex number is increased by <b>z</b>=(c+di) so that the new
     * number is given by ((a+c)+(b+d)<b>i</b>).
     *
     * @param z increase the complex number by z
     */
    public void increaseBy(Complex z)
    {
        realpart += z.getReal();
        imagpart += z.getImag();
        return;
    }


    /**
     * static method to add together two complex numbers and return
     * the result, z = (a+bi), w = (c+di) then return y =
     * ((a+c)+(b+d)<b>i</b>)
     *
     * @param z one of the numbers to be added
     * @param w one of the numbers to be added
     * @return the sum
     */
    public static Complex add(Complex z, Complex w)
    {
        Complex sum = new Complex();
        sum.realpart = z.getReal() + w.getReal();
        sum.imagpart = z.getImag() + w.getImag();
        return sum;
    }

    /**
    *  method to convert the complex number into
    *  its complex conjugate
    */
    public void conjugate()
    {
    	    imagpart=-1.0*imagpart;
    }
    

    
    /**
     *  method to print out the object in usual complex number form
     * i.e. print out a + bi
     */
    public void print()
    {
        System.out.print(realpart);
        if (imagpart < 0)
        {
            System.out.print(" - " + (-1*imagpart) + "i");
        }
        else if (imagpart > 0)
        {
            System.out.print(" + " + imagpart + "i");
        }
        System.out.println("");
        return;
    }
    
 
}
