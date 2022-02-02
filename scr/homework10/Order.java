package homework10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    @Override
    public String toString() {

        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", dedliveryDate=" + deliveryDate +
                ", products=" + products.toString() +
                ", customer=" + customer +
                '}';
    }

    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    List<Product> products ;
    private Customer customer;


    public Order(long id, String status, LocalDate orderDate, LocalDate dedliveryDate, ArrayList<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = dedliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDedliveryDate(LocalDate dedliveryDate) {
        this.deliveryDate = dedliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
