// Parent class Product
class Product {
    private String productId;
    private String productName;

    // Constructor to initialize Product attributes
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }
}

// Subclass Electronic that extends Product
class Electronic extends Product {
    private String warranty; // Additional attribute specific to Electronic products

    // Constructor for Electronic class that calls the parent constructor using super()
    public Electronic(String productId, String productName, String warranty) {
        super(productId, productName); // Calls the constructor of the parent class Product
        this.warranty = warranty; // Initializes the warranty for Electronic
    }

    // Overriding the displayDetails method to include warranty details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to parent class method to display common product details
        System.out.println("Warranty: " + warranty); // Adds warranty detail specific to Electronic
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Electronic class
        Electronic electronicProduct = new Electronic("E12345", "Smartphone", "2 Years");

        // Displaying the details of the electronic product
        electronicProduct.displayDetails();
    }
}
