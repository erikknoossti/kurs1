package se.erik.klass;

class People{

    private String name;
    private boolean hasDrivingLicense;
    private int age;
    private int passengers;

    public People( String name, boolean hasDrivingLicense, int age, int passengers){
        this.name = name;
        this.hasDrivingLicense = hasDrivingLicense;
        this.age = age;
        this.passengers = passengers;
    }

    public String toString(){
        return "Name: " + name + "Driving License: " + hasDrivingLicense + "age: " + age + "passengers: " + passengers;
    }


}
class Engine {
    private String Type;
    private int horsePower;
    private double engineVolume;

    public Engine(String Type, int horsePower, double engineVolume) {
        this.Type = Type;
        this.horsePower = horsePower;
        this.engineVolume = engineVolume;

    } // Car är beroende av Engine, men inte tvärtom
}
    class Car{
        private Engine engine;
        private People people;

        public Car(Engine engine, People people){
            this.engine = engine;
            this.people = people;

        }

    }





public class Main {
    public static void main(String[] args) {

        int[] v = {6,8,9,10,3,2,9};
        People people1 = new People("John", true, 20, 2);
        Engine engine1 = new Engine("type1", 100, 50);
        Car car1 = new Car(engine1, people1);
        System.out.println(people1);

    }
}
