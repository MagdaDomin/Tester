package ZadanieLekcja9.Kompozycja;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Customer customer;
    float orderValue;
    int numberOfElements;
    boolean payed;
    boolean delivered;
    List<Product> productList= new ArrayList<>();


    public Order(Customer customer, int numberOfElements, boolean payed, boolean delivered) {
        this.customer = customer;
        this.numberOfElements = numberOfElements;
        this.payed = payed;
        this.delivered = delivered;
    }

    public float calculateOrderValue() {
//      float a= productList.get(0).price;
//      float b=productList.get(1).price;
//      float c= productList.get(2).price;
//      float d=productList.get(3).price;
//      float e=productList.get(4).price;
//      orderValue=a+b+c+d+e;
        for (Product product: productList) {
          orderValue +=  product.price;
        }
        return orderValue;
    }

    public void addProductToOrder(Product product) {
        productList.add(product);
    }
}

