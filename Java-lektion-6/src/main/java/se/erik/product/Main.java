package se.erik.product;

public class Main {
    public static void main(String[] args) {
    Product products1 = new Product("Bil", 10000);
    Product products2 = new Product("cykel", 1000);
    Product products3 = new Product("buss", 100000);
    Customer customer = new Customer("Erik", "erikknoos@.com");
    Product[] products = {products1, products2, products3};
    order order1 = new order(customer, products);

        System.out.println(order1.calculateTotal());
        System.out.println(order1.billigast(products));
        System.out.println(order1.dyrast(products));











    }


}
