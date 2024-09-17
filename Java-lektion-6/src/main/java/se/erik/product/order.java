package se.erik.product;

public class order {
    private Customer customer;
    private Product[] products;

    //kontstruktor
    public order(Customer customer, Product[] products) {
        this.customer = customer;
        this.products = products;

    }
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;

    }
    public double billigast(Product[] products) {
        double billigast = Integer.MAX_VALUE;// räknar ner
        for (Product product : products) {
            billigast = Math.min(billigast, product.getPrice());
        }
        return billigast;
    }

        public double dyrast(Product[] products){
            double dyrast = Integer.MIN_VALUE; // börjar räkna upp från 0
            for (Product product : products) {
                dyrast = Math.max(dyrast, product.getPrice());
            }
            return dyrast;
        }

    public Product[] getProducts(){
        return products;
    }
    public Customer getCustomer(){
        return customer;
    }

}
