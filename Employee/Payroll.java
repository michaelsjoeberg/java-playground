import java.util.*;
import ou.*;
/**
 * Payroll class for employee details.
 * 
 * @author MICHAEL SJOEBERG 
 * @version 1.0
 */
public class Payroll
{
   // instance variables
   private SortedSet<Employee> employeeSet;
   
   /**
    * Constructor for objects of class Payroll
    */
   public Payroll()
   {
      // initialise instance variables
      this.employeeSet = new TreeSet<Employee>();
   }
   
   /**
    * Method for creating an instance of Employee and adding it to the set
    */
   public void enrollEmployee(String eNum)
   {
      Employee newEmployee = new Employee(eNum);
      this.employeeSet.add(newEmployee);
   }
   
   /**
    * Method for printing record of employees
    */
   public void printEmployees()
   {
      // loop for printing each item in set
      for(Employee employee : employeeSet) {
         System.out.println(employee.getFirstName() + " " + 
                            employee.getSecondName() + " " + 
                            employee.getEmployeeNumber() + " " + 
                            "sales " + employee.getSales());
      }
   }
   
   /**
    * Method for updating sales figures
    */
   public void updateSalesFigures(Map<String, Integer> aMap) 
   { 
      // loop for iterating the set of employees
      for (Employee employee : employeeSet) {
         // check whether employeeNumber is in map and if so update sales
         if (aMap.containsKey(employee.getEmployeeNumber())) {
            employee.setSales(employee.getSales() + aMap.get(employee.getEmployeeNumber()));
         }
      }
   }
   
   /**
    * Method for adding first and second name to instances with no name
    */
   public void nameEmployees() 
   {
      for (Employee employee : employeeSet) {
         // local variable for employee name
         String newName;
         String[] nameArray;
         
         // conditional for checking whether employee has name or not
         if (employee.hasName() == false) {
            // ask for user input, continue if cancelled
            newName = OUDialog.request("Enter first and last name of employee with number: " + employee.getEmployeeNumber());
            if (newName != null) {
               // split input into first and second name
               nameArray = newName.split(" ");
            
               // set the new first and second name
               employee.setFirstName(nameArray[0]);
               employee.setSecondName(nameArray[1]); 
            }
            else {
               continue;
            }                 
         }
      }
   }
}
