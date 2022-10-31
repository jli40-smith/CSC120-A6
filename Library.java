import java.util.Hashtable;

public class Library extends Building {

    private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
      super(name, address, nFloors);
      this.collection = collection; 

      System.out.println("You have built a library");
    }
  
    public void addTitle(String title) {
      collection.put(title, true);
    }

    public String removeTitle(String title) {
      collection.remove(title);
      return title;
    }

    public void checkOutTitle(String title) {
      collection.replace(title, true, false); 
    }
    
    public void returnTitle(String title) {
      collection.replace(title, false, true);
    }

    public static void main(String[] args) {

      Library neilsonLibrary =  new Library("Neilson Library", "Neilson Drive", 4, new Hashtable<String, Boolean>());
      
      //Add a book
      neilsonLibrary.addTitle("The Wealth of Nations by Adam Smith");
      //Check if book was added 
      System.out.println(neilsonLibrary.collection.containsKey("The Wealth of Nations by Adam Smith"));
      
      //Remove the book
      neilsonLibrary.removeTitle("The Wealth of Nations by Adam Smith"); 
      //Check if book was removed 
      System.out.println(neilsonLibrary.collection.containsKey("The Wealth of Nations by Adam Smith"));
    }
  
  }