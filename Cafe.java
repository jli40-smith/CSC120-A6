/**
 * A Building which keeps count of an inventory of coffee 
 * components which can be sold and restocked
 * 
 * @author Joanna Li 
 * @version 11/02/2022
 */
public class Cafe extends Building {
    
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /**
     * Constructs a Cafe
     * 
     * @param name String name of the cafe 
     * @param address String street address of the cafe 
     * @param nFloors int equal to the number of floors in the cafe 
     * @param nCoffeeOunces int ounces of coffee left in the inventory 
     * @param nSugarPackets int number of sugar packets left in the inventory 
     * @param nCreams int number of creams left in the inventory 
     * @param nCups int number of coffee cups left in the inventory 
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);

        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;

        System.out.println("You have built a cafe");
    }

    /**
     * Sells a cup of coffee and subtracts the given amounts of cups
     *  or ingredients used from the inventory counts
     * 
     * @param nCoffeeOunces int ounces of coffee sold
     * @param nSugarPackets int number of sugar packets sold 
     * @param nCreams int number of creams sold 
     */
    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= nCoffeeOunces;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    /**
     * Restocks the Cafe inventory by adding the given amounts 
     * of coffee ingredients and cups to the inventory counts
     * 
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    /**
     * Main method for testing Cafe methods
     * @param args String array with command-line arguments
     */
    public static void main(String[] args) {
        Cafe compassCafe = new Cafe("Compass Cafe", "Neilson Drive", 1, 10, 10, 10, 10);
        System.out.println(compassCafe.nCups);
        
        //Testing sellCoffee()
        compassCafe.sellCoffee(4, 3, 2);
        System.out.println(compassCafe.nCups);
        System.out.println(compassCafe.nCoffeeOunces);
        System.out.println(compassCafe.nSugarPackets);
        System.out.println(compassCafe.nCreams);

        //Testing restock()
        compassCafe.restock(4, 3, 2, 1);
        System.out.println(compassCafe.nCups);
        System.out.println(compassCafe.nCoffeeOunces);
        System.out.println(compassCafe.nSugarPackets);
        System.out.println(compassCafe.nCreams);

    }
    
}
