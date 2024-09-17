package oop_test;

class Person {

    private String name;
    private int age;
    private String city;


    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;

    }

    public void show(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("city: " + city);
    }


    }






