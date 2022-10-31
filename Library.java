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
      System.out.println("You have added " + title + " to the collection");

    }

    public String removeTitle(String title) {
      collection.remove(title);
      System.out.println("You have removed " + title + " from the collection");
      return title;
    }

    public void checkOutTitle(String title) {
      collection.replace(title, true, false);
      System.out.println("You have checked out " + title);
    }
    
    public void returnTitle(String title) {
      collection.replace(title, false, true);
      System.out.println("You have returned " + title);
    }

    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title) {
      return collection.get(title);
    }


    public static void main(String[] args) {

      Library neilsonLibrary =  new Library("Neilson Library", "Neilson Drive", 4, new Hashtable<String, Boolean>());
      
      //Add a book
      neilsonLibrary.addTitle("The Wealth of Nations by Adam Smith");
      //Check if book was added 
      System.out.println(neilsonLibrary.containsTitle("The Wealth of Nations by Adam Smith"));

      //Check out the book 
      neilsonLibrary.checkOutTitle("The Wealth of Nations by Adam Smith");
      System.out.println(neilsonLibrary.isAvailable("The Wealth of Nations by Adam Smith"));

      //Return the book 
      neilsonLibrary.returnTitle("The Wealth of Nations by Adam Smith");
      System.out.println(neilsonLibrary.isAvailable("The Wealth of Nations by Adam Smith"));

      //Remove the book
      neilsonLibrary.removeTitle("The Wealth of Nations by Adam Smith");

      //Check if book was removed 
      System.out.println(neilsonLibrary.containsTitle("The Wealth of Nations by Adam Smith"));
    }
  
  }