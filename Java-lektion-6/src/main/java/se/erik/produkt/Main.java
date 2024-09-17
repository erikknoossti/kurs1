package se.erik.produkt;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Erik", "erik@gmail.com");
        Customer customer2 = new Customer("Kalle", "Kalle@gmail.com");

        Product product1 = new Product("dator", 10000);
        Product product2 = new Product("laptop", 20000);
        Product product3 = new Product("bil", 30000);

        //skapa en array av products
        Product[] products = {product1,product2};
        Product[] products2 = {product1, product2, product3};

        Order order1 = new Order(customer1, products);
        Order order2 = new Order(customer1, products2);

        order1.printOrder(customer1, products);


        }







    }
