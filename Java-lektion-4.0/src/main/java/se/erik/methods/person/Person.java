package se.erik.methods.person;

class Person {

    private String Person;
    private int age;
    private String name;
    private String city;



    public Person(String person, int age, String name, String city) {
        this.Person = person;
        this.age = age;
        this.name = name;
        this.city = city;

    }

    public void show(){
        System.out.println("Person: " + Person + ", age: " + age + ", name: " + name + ", city: " + city);
    }







}
