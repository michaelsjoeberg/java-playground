import java.util.*;
import java.io.*;

/**
  * GangDossier Class for Revision.
  * 
  * @author www.github.com/mqe
  * @version 1
  */

public class GangDossier
{
  // instance variables
  private SortedMap<Integer, Set<String>> gangTable;

  /**
    * Constructor
    */
  public GangDossier()
  {  
    // initialise variables
    super();

    // creating empty table
    this.gangTable = new TreeMap<>();

    // populate table
    newGangDossier.addMember(3, "Poot");
    newGangDossier.addMember(3, "Bodie");
    newGangDossier.addMember(3, "Wee-bay");
    newGangDossier.addMember(3, "Slim");
    newGangDossier.addMember(3, "Bird");
    newGangDossier.addMember(7, "Cheese");
    newGangDossier.addMember(7, "Tree");
    newGangDossier.addMember(7, "Slim");
    newGangDossier.addMember(8, "Dante");
    newGangDossier.addMember(8, "Kimmy");
    newGangDossier.addMember(8, "Tosha");
    newGangDossier.addMember(8, "Butchie");
    newGangDossier.addMember(11, "Snoop");
    newGangDossier.addMember(11, "Jamal");
    newGangDossier.addMember(11, "Fruit");
    newGangDossier.addMember(11, "Monk");
    newGangDossier.addMember(11, "Chris");
    newGangDossier.addMember(19, "Vondas");
    newGangDossier.addMember(19, "Sergei");
  }

  /**
    * Method for adding new gang member to new or existing gang.
    */
  private boolean addMember(Integer gangId, String newMember)
  {
    // check if gang id exists
    if (!this.gangTable.containsKey(gangId))
    {
      // create new set for gang id
      HashSet<String> newMembers = new HashSet<>();
      this.gangTable.put(gangId, newMembers);
    }

    // add member to set
    return this.gangTable.get(gangId).add(newMember);
  }

  /**
    * Method for for finding gangs of member
    */
  private Set<Integer> findGangs(String name)
  {
    // check if gang id exists
    Set<Integer> hits = new HashSet<>();
    Set<Integer> gangIdSet = this.gangTable.keySet();

    // check every gang id in set
    for (Integer gangId : gangIdSet)
    {
      // get members of gang id
      Set<String> members = this.gangTable.get(gangId);

      if (members.contains(name))
      {
        // add gang id to set
        hits.add(gangId);
      }
    }

    // return set of gang ids
    return hits;
  }

  /* init */
  public static void main(String args[])
  {
    // create object
    GangDossier newGangDossier = new GangDossier();

    // test methods
    System.out.println(newGangDossier.findGangs("Slim"));
  }
}
