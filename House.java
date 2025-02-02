import java.util.ArrayList;

/**
 * A Building which tracks the residents 
 * living in a Smith house 
 * 
 * @author Joanna Li 
 * @version 11/02/2022
 */
public class House extends Building {

  private  boolean hasDining;
  private ArrayList<String> residents;

  /**
   * Constructs a House 
   * @param name String name of the house 
   * @param address String street address of the house 
   * @param nFloors int number of floors in the house 
   * @param hasDiningRoom boolean indicating if the house has a dining room 
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    
    super(name, address, nFloors);
    residents = new ArrayList<String>();
    this.hasDining = hasDiningRoom;

    System.out.println("You have built a house");
  }
  
  /**
   * Checks if a house has a dining room
   * @return boolean indicating if the house has a dining room 
   */
  public boolean hasDiningRoom() {
    return hasDining; 
  }

  /** 
   * Returns the number of residents living in the house
   * @return int number of residents living in the house
   */
  public int nResidents() { 
    return residents.size(); 
  }
  /** 
   * Adds a resident to the house 
   * @param name String name of the resident moving in 
   */
  public void moveIn(String name) { 
    residents.add(name); 
  }
  
  /** 
   * Removes a resident from the house 
   * @param name String name of the resident moving out 
   */
  public String moveOut(String name) { 
    residents.remove(name);
    return name;
  }

  /** 
   * Checks if a person is a resident of the house
   *
   * @param person String name of the person to check for in the house
   * @return boolean indicating if the person is a resident of the house 
   */
  public boolean isResident(String person) { 
    return residents.contains(person); 
  }

    /**
     * Main method for testing House methods
     * @param args String array with command-line arguments
     */
  public static void main(String[] args) {

    House lamontHouse = new House("Lamont", "Prospect Street", 3, true);

    System.out.println(lamontHouse);
    System.out.println(lamontHouse.hasDiningRoom());
    
    lamontHouse.moveIn("Jenny");
    System.out.println(lamontHouse.nResidents());

    lamontHouse.moveIn("Jared");
    System.out.println(lamontHouse.nResidents());

    System.out.println(lamontHouse.moveOut("Jared"));
    System.out.println(lamontHouse.isResident("Jared"));

  }

}