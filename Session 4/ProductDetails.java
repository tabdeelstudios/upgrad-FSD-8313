import java.util.Scanner;

class Product{
    // Data Members
    public String productName;
    public float productPrice;
    private boolean inStock;

    // Constructor
    public Product(String productName, float productPrice, boolean inStock){
        this.productName = productName;
        this.productPrice = productPrice;
        this.inStock = inStock;
    }

    // Constructor overloading
    public Product(String productName, float productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
        this.inStock = false;
    }

    // Methods
    public void printDetails(){
        // Concatenation
        System.out.println("We are currently exploring "+ productName);
    }

    public void printDetails(String username){
        // Concatenation
        System.out.println("Hi, "+username+"! We are currently exploring "+ productName+".");
    }

    // Getter - Setter
    public boolean showStock(){
        return inStock;
    }
}

class PremiumProduct extends Product{

    float subscriptionCost;

    public PremiumProduct(String productName, float productPrice, boolean inStock, float subscriptionCost) {
        super(productName, productPrice, inStock);
        this.subscriptionCost = subscriptionCost;
    }

    // Method Overriding
    public void printDetails(){
        super.printDetails();
        System.out.println("The subscription cost is : "+subscriptionCost);
    }
    
}

public class ProductDetails{
    public static void main(String args[]){
        // Instatiate object - create an instance of class
        Product shampoo = new Product("Shampoo", 500, true);
        shampoo.printDetails();
        // System.out.println(shampoo.showStock());

        // // Instatiate object - create an instance of class
        // Product facewash = new Product("Facewash", 200);
        // facewash.printDetails();

        // Scanner myScanner = new Scanner(System.in);
        // String username = myScanner.next();
        // facewash.printDetails(username);

        // myScanner.close();

        PremiumProduct starPerfume = new PremiumProduct("Star Perfume", 1000, true, 150);

        starPerfume.printDetails();
    }
}