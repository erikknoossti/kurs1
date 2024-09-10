package oop_test;

public class Personmain {
    public static void main(String[] args) {

        System.out.println("Hej jag heter Erik, jag är 21 år och bor i stockholm");

        Person Person1 = new Person("kille", 21, "Erik", "stockholm");
        Person1.show();
    }
}
