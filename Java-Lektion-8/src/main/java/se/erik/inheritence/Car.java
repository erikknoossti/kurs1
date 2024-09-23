package se.erik.inheritence;

import org.w3c.dom.ls.LSOutput;

public class Car extends Vehicle {
    public String brand;

    public Car(int speed, String name){
        super(speed, name);
        this.brand = brand;

    }

    @Override
    public void startEngine() {

    }
    }



