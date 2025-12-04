package grocery;

public class Product {
    private int id;
    private String name;
    private String category;
    private int quantity;
    private double price;
    private String expiryDate;

    public Product(int id, String name, String category, int quantity, double price, String expiryDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public String getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + category + " | Qty: " + quantity + " | Price: " + price + " | Exp: " + expiryDate;
    }
}
