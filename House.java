import java.util.ArrayList;

public class House extends Building {

  private  boolean hasDining;
  private ArrayList<String> residents;

  public House(String name, String address, int nFloors, boolean hasDiningRoom, ArrayList<String> residents) {
    
    super(name, address, nFloors);
 
    this.hasDining = hasDiningRoom;
    this.residents = residents;

    System.out.println("You have built a house");
  }

  
  public boolean hasDiningRoom() {
    return hasDining; 
  }

  public int nResidents() { 
    return residents.size(); 
  }

  public void moveIn(String name) { 
    residents.add(name); 
  }
  
  public String moveOut(String name) { 
    residents.remove(name);
    return name;
  }

  public boolean isResident(String person) { 
    return residents.contains(person); 
  }

  public static void main(String[] args) {
    ArrayList<String> lamontResidents = new ArrayList<String>(); 
    lamontResidents.add("Jenny");

    House lamontHouse = new House("Lamont", "Prospect Street", 3, true, lamontResidents);

    System.out.println(lamontHouse);
    System.out.println(lamontHouse.hasDiningRoom());
    System.out.println(lamontHouse.nResidents());

    lamontHouse.moveIn("Jared");
    System.out.println(lamontHouse.nResidents());

    System.out.println(lamontHouse.moveOut("Jared"));
    System.out.println(lamontHouse.isResident("Jared"));

  }

}