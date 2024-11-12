package projektTest;

import java.util.Scanner;

public class Player {
    Scanner scanner1 = new Scanner(System.in);
    private String name;

    public Player(String name) {
        this.name = name;

    }

    public void setName() {
        name = scanner1.nextLine();
    }

    public String getName() {
        return this.name;
    }

    static void print1() {
        System.out.println("Player 1: ");
    }

    static void print2() {
        System.out.println("Player 2: ");
    }


}


