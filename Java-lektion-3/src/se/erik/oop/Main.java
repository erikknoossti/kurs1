package se.erik.oop;
public class Main { // Public class alltid main
    public static void main(String[] args) {
        Bil Bil1 = new Bil("AAA",15000,"Orange",2015, 0);
        Bil1.start();
        Bil1.setSpeed(0);
        Bil1.accelerate(50);
        Bil1.deccelerate(50);
        Bil1.stop();

        System.out.println("-".repeat(100));
        Bil1.start();
        Bil1.accelerate(20);
        Bil1.stop();
        Bil1.stop();





       /* Bil1.setModel("Volvo");
        Bil1.setPrice(20000);
        Bil1.setBuildYear(2020);
        Bil1.show();
*/

       // System.out.println("car cost = " + Bil1.getPrice());

        //Bil Bil2 = new Bil("BBB",20000, "Black", 2020, 50);
        //Bil2.show();









    }
}

