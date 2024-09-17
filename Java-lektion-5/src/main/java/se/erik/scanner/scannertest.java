package se.erik.scanner;
import java.util.Scanner;
public class scannertest {
    public static void main(String[] args) {

        int operation = 0;
        int first = 0;
        int second = 0;
        boolean loop = true;

        System.out.println("skriv två nummer");

        Scanner scanner = new Scanner(System.in);
        first = scanner.nextInt();
        second = scanner.nextInt();

        System.out.println("Välj en operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        scanner Scanner = new scanner(first, second);


        while (loop){
            operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println(" add = " + Scanner.add());
                break;
            case 2:
                System.out.println(" sub = " + Scanner.sub());
                break;
            case 3:
                System.out.println("mul = " + Scanner.mul());
                break;
            case 4:
                System.out.println("div = " + Scanner.div());
                break;
            case 5: loop = false;
                break;

        }
        }
    }
}
