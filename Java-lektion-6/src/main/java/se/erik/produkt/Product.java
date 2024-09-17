package se.erik.produkt;

public class Product {
    private String product;
    private double price;

    public Product(String name, double price){
        this.product = name;
        this.price = price;
    }
    public String getProduct(){
        return product;
    }
    public String setProduct(String product){
        return this.product = product;
    }
    public double getPrice(){
        return price;
    }
    public double setPrice(int price){
        return this.price = price;
    }
}
