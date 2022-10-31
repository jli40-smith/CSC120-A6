import java.util.Hashtable;

public class Library extends Building {

    private Hashtable<String, Boolean> collection;  

    public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
      super(name, address, nFloors);
      this.collection = collection; 

      System.out.println("You have built a library");
    }
  
    public static void main(String[] args) {
      
      Hashtable<String, Boolean> collection = new Hashtable<String, Boolean>();

      new Library("Neilson Library", "Neilson Drive", 4, collection);
    }
  
  }