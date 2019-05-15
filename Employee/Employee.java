  /**
  * Class Employee models employees in a sales company.
  * 
  * @author M250 Course Team 
  * @version 1.0
  */
 
 public class Employee implements Comparable<Employee> 
 {
    /* instance variables */
    private String firstName;
    private String secondName;
    private String employeeNumber;
    private int sales;
    
    /**
     * Constructor for instances of Employee.
     */
    public Employee(String empNum)
    {
       super();
       this.employeeNumber = empNum;             
    }
        
   /**
    * Implements Comparable<Employee>. 
    */
   public int compareTo(Employee anotherEmployee)
   {
      int result = this.getEmployeeNumber().compareTo(anotherEmployee.getEmployeeNumber());   
      return result;
   }
    
    /**
     * Sets the receiver's firstName.
     */
    public void setFirstName(String name)
    {
       this.firstName = name;
    }
         
    /**
     * Returns the receiver's firstName.
     */
    public String getFirstName()
    {
       return this.firstName;
    }
       
    /**
     * Sets the receiver's secondName.
     */
    public void setSecondName(String name)
    {
       this.secondName = name;
    }
           
    /**
     * Returns the receiver's secondName.
     */   
    public String getSecondName()
    {
       return this.secondName;
    }
       
    /**
     * Returns the receiver's employeeNumber.
     */
    public String getEmployeeNumber()
    {
       return this.employeeNumber;
    }
       
    /**
     * Sets the receiver's sales to the argument.
     */   
    public void setSales(int salesFigures)
    {
       this.sales = salesFigures;
    }
           
    /**
     * Returns the receiver's sales.
     */
    public int getSales()
    {
       return this.sales ;
    }
       
    /**
     * Returns the receiver's full name.
     */
    public String getFullName()
    {
       return this.getFirstName() + " " + this.getSecondName();
    }
       
    /**
     * Returns the receiver's employee number and sales figures as a string.
     */
    public String getDetails()
    {
       return this.getEmployeeNumber() + " sales " + this.getSales();
    }
         
    /**
     * Returns the receiver's full name, employee number 
     * and sales figures as a string.
     */
    public String getFullRecord()
    {
       return this.getFullName() + " " + this.getDetails();
    }
    
   /**
    * Method for checking if receiver firstName or secondName variable is not equal to 'null'
    */
   public boolean hasName() 
   {  
      if (this.firstName != null || this.secondName != null) {
         return true;
      }
      else {
         return false;
      }
   } 
 }
