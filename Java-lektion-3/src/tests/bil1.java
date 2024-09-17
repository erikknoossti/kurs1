package tests;

public class bil1 {

    private String name;
    private int buildYear;
    private int speed;
    private double price;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public bil1(String name, int buildYear, int speed, double price, String color) {
        this.name = name;
        this.buildYear = buildYear;
        this.speed = speed;
        this.price = price;
        this.color = color;
    }



        public void stop(){
            System.out.println("Bilen har stoppat");
        }


        public void start(){
            System.out.println("bilen startat");
        }

        public void setSpeed(int speed) {
        this.speed = speed;
            System.out.println("Bilen åker i " + speed + "km/h");
        }

        public void accelerate( int increase){
        speed += increase;
            System.out.println("bilen ökade farten till " + speed + "km/h");
        }

        public void deccelerate( int decrease) {
            speed -= decrease;
            System.out.println("bilen saktade ner till " + speed + "km/h");

    }


    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBuildYear(){
        return buildYear;
    }

    public void setBuildYear(int buildYear){
        this.buildYear = buildYear;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
