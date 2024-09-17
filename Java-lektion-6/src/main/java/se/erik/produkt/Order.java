package se.erik.produkt;


public class Order {
    private Customer customer;
    private Product[] product;

    public Order(Customer customer, Product[] product) {
        this.customer = customer;
        this.product = product;

    }


    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProduct() {
        return product;
    }

    public void printOrder(Customer customer, Product[] product) {
        System.out.println("customer: " + customer.getEmail() + " " + customer.getName());
        for (int i = 0; i < product.length; i++) {
            System.out.println("product " + i + " : " + product[i].getProduct() + " " + product[i].getPrice());
        }
    }


}
