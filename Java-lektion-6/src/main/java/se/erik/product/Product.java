package se.erik.product;

public class Product {

    private String name;
    private double price;

//konstruktor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }
    public String setName(String name){
        return this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    public double getPrice(double price){
        return this.price = price;
    }



}
