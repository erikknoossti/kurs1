package Newclass;

class cat {


    //ATTRIBUTER
    String color;
    int year;
    String breed;


    //KONSTRUKTOR
    public cat(String color, int year, String breed) {
        this.color = color;
        this.year = year;
        this.breed = breed;


        }

    public void show(){
        System.out.println(" color " + color + " year " + year + " breed " + breed);
    }


}
