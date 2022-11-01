public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors); 
        System.out.println("You have built a cafe");
        this.nCoffeeOunces = nCoffeeOunces; 
        this.nSugarPackets = nSugarPackets; 
        this.nCreams = nCreams; 
        this.nCups = nCups; 
    }

    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams) {
        this.nCups -= 1; 
        this.nCoffeeOunces -= nCoffeeOunces; 
        this.nSugarPackets -= nSugarPackets; 
        this.nCreams -= nCreams; 
    }
    
    public static void main(String[] args) {
        Cafe compassCafe = new Cafe("Compass Cafe", "Neilson Drive", 1, 10, 10, 10, 10);
        
        //Testing sellCoffee()
        System.out.println(compassCafe.nCups);
        compassCafe.sellCoffee(5, 4, 3);
        System.out.println(compassCafe.nCups);
        System.out.println(compassCafe.nCoffeeOunces);
        System.out.println(compassCafe.nSugarPackets);
        System.out.println(compassCafe.nCreams);
    }
    
}
