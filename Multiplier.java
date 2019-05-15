
/**
 * This Class returns the product of two numbers using the message multiply(a,b), 
 * whereas 'a' and 'b' are integers.
 * 
 * @author Michael Sjoeberg (PI: D126084X)
 * @version 1.1
 */
public class Multiplier
{
   /**
    * Constructor for objects of class Multiplier
    */
   public Multiplier()
   {
      // initialise instance variables
   }
   
   /**
    * Method for multiplying the two arguments 'int a', 'int b' and return the product.
    */
   public int multiply(int a, int b)
   {
      // return the product of arguments a, b
      return a * b;
   }
   
   /**
    * Method for deciding whether the product is zero, negative, or positive, and print the result.
    */
   public void printSign(int a, int b)
   {
      int product = this.multiply(a,b);
      
      // print when product is zero
      if (product == 0)
      {
         System.out.println("The product is zero");
      }
      
      // print when product is negative or positive respectively
      else {
         if (product < 0)
         {
            System.out.println("The product is negative");
         }
         else 
         {
            System.out.println("The product is positive");
         }
      }
   }
}
