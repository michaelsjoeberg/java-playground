import java.util.*;

/**
 * Class Sales - a utility class to help test the updateSalesFigures() 
 * method in the Payroll class.
 */

public class Sales
{   
   /**
    * Returns a map whose keys are numeric strings and
    * whose values are integers.
    */
   public static Map<String, Integer> getSales()
   {
      Map<String, Integer> sales = new HashMap <String, Integer>();
      sales.put("1200", 800000);
      sales.put("1202", 750000);
      sales.put("1203", 540000);
      sales.put("1205", 390000);
      return sales;
   }   
}

