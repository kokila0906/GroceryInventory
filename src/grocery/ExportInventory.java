package grocery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportInventory {
    public static void exportToJSON() {
        List<Product> products = ProductDAO.getAllProducts();
        StringBuilder json = new StringBuilder("[\n");

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            json.append("  {")
                .append("\"id\":").append(p.getId()).append(", ")
                .append("\"name\":\"").append(p.getName()).append("\", ")
                .append("\"category\":\"").append(p.getCategory()).append("\", ")
                .append("\"quantity\":").append(p.getQuantity()).append(", ")
                .append("\"price\":").append(p.getPrice()).append(", ")
                .append("\"expiry\":\"").append(p.getExpiryDate()).append("\"")
                .append("}");

            if (i < products.size() - 1) json.append(",");
            json.append("\n");
        }
        json.append("]");

        // FIX: EXPORT JSON TO WEB FOLDER
        String webPath = System.getProperty("user.dir") + "/web/products.json";

        try (FileWriter fw = new FileWriter(webPath)) {
            fw.write(json.toString());
            System.out.println("JSON exported to: " + webPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
