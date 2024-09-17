package se.erik.methods.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        double first = 0;
        double second = 0;
        boolean loop = true;

        Scanner scan = new Scanner(System.in);
        first = scan.nextInt();
        second = scan.nextInt();

        calc calc1 = new calc(first, second);

        while (loop) {
            System.out.println("Choose 1.add 2. subtract 3. multiply 4. divide 5. exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1: System.out.println("add = " + calc1.add());
                    break;
                case 2: System.out.println("subtract = " + calc1.subtract());
                    break;
                case 3: System.out.println("multiply = " + calc1.multiply());
                    break;
                case 4: System.out.println("divide = " + calc1.divide());
                    break;
                case 5: loop = false;
                    break;
            }
        }


    }


}
