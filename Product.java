package ZadanieLekcja9.Kompozycja;

public class Product {
    float price;
    private String productName;
    private String productManufacturer;

    public Product(float price, String productName, String productManufacturer) {
        if (productManufacturer.length() > 30 || productName.length() > 30) {
            System.out.println("error");
        }
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        if ( price < 0) {
            System.out.println("Error");
        } else {
            this.price=price;
        }

    }
}
