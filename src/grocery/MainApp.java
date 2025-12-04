package grocery;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Grocery Store Inventory ======");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Export to JSON");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Category: ");
                    String cat = sc.next();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Expiry (YYYY-MM-DD): ");
                    String exp = sc.next();

                    ProductDAO.addProduct(new Product(0, name, cat, qty, price, exp));
                    break;

                case 2:
                    for (Product p : ProductDAO.getAllProducts()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Product ID: ");
                    int idu = sc.nextInt();
                    System.out.print("New Qty: ");
                    int nq = sc.nextInt();
                    System.out.print("New Price: ");
                    double np = sc.nextDouble();
                    ProductDAO.updateProduct(idu, nq, np);
                    break;

                case 4:
                    System.out.print("Product ID: ");
                    int idd = sc.nextInt();
                    ProductDAO.deleteProduct(idd);
                    break;

                case 5:
                    ExportInventory.exportToJSON();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
