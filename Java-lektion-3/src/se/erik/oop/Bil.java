package se.erik.oop;

class Bil {
    //ATTRIBUT
    private String model;
    private double price;
    private String color;
    private int buildYear;
    private int speed = 0;

    public int getSpeed(){
        return speed;
    }






    //KONSTRUKTOR  public namn of class
    public Bil(String model, double price, String color, int buildYear, int speed) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.buildYear = buildYear;
        this.speed = speed;

    }

    public void start(){
        System.out.println("Bil start");
    }
    public void stop(){
        System.out.println("Bil stop");
    }
    public void accelerate(int increase){
        this.speed += increase;
    }


        {







    }

    //GETTER OCH SETTER for model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getBuildYear() {
        return buildYear;
    }
    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }














}
