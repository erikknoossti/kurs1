package tests;

public class newclass {
    public static void main(String[] args) {

        bil1 bil1 = new bil1("Volvo", 2018, 0, 25000, "black");
        bil1.start();
        bil1.setSpeed(0);
        bil1.accelerate(100);
        bil1.deccelerate(100);
        bil1.stop();

    }
}
