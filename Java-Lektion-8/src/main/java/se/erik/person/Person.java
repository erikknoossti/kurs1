package se.erik.person;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void introduce(){
        System.out.println("Name: " + name + " age: " + age);

    }

}