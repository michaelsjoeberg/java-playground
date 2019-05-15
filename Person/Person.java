import java.util.*;
import java.io.*;

/**
  * Person Class for Revision.
  * 
  * @author www.github.com/mqe
  * @version 1
  */

public class Person
{
  // instance variables
  String firstName;
  String secondName;
   
  /**
    * Constructor
    */
  public Person(String first, String second)
  {  
    // initialise instance variables
    this.firstName = first;
    this.secondName = second;
  }

  /**
    * Method for getting initials.
    */
  public String getInitials()
  {
    // return first char of firstName and secondName
    return "" + this.firstName.charAt(0) + this.secondName.charAt(0);
  }

  /**
    * Method for getting full name.
    */
  public String getName()
  {
    // return firstName and secondName as single string
    return "" + this.firstName + " " + this.secondName;
  }

  /**
    * Method for getting initials.
    */
  public void printReverse()
  {
    // return reversed string using StringBuilder
    StringBuilder temp = new StringBuilder(this.getName());
    System.out.println(temp.reverse());
  }

  /**
    * Method for checking equality of strings.
    */
  public boolean equals(Person aPerson)
  {
    // return true or false
    return (this.firstName.equals(aPerson.firstName)) && (this.secondName.equals(aPerson.secondName));
  }

  /* init */
  public static void main(String args[])
  {
    // create object
    Person person1 = new Person("Alice", "Jones");
    Person person2 = new Person("Anna", "Jones");
    Person person3 = new Person("Alice", "Jones");

    // test methods
    // System.out.println(person.getInitials());
    // System.out.println(person.getName());
    // person.printReverse();

    System.out.println(person1.equals(person2)); // false
    System.out.println(person1.equals(person3)); // true
  }
}
