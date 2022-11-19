public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();

        product.name = "MSI Laptop";
        product.price = 15000;

        manager.add(product);

        // Inner class
        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.create();

    }
}