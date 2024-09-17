package se.erik.produkt;

public class Customer {
    private String name;
    private String email;


    public Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public String setEmail(String email){
        return this.email = email;
    }
}
