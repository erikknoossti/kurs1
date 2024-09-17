package se.erik.Felhantering;

public class Main {
    public static void main(String[] args) {
        fel fel1 = new fel();

        try {
            fel1.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("man kan inte dela med 0");
        }
    }



}




