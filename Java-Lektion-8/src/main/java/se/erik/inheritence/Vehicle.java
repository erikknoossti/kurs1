package se.erik.inheritence;

public abstract class Vehicle {
    private int speed;
    private String name;

    public Vehicle( int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }
    public abstract void startEngine();

    }



