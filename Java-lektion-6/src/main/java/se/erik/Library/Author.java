package se.erik.Library;

public class Author {
    private String name;
    private int age;

    public Author(String name, int age){
        setName(name);
        setAge(age);
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }





}
