package projektTest;

import java.util.Scanner;

public class Game {

    Scanner scanner1 = new Scanner(System.in);

    Roll roll = new Roll(0);

    Player player1 = new Player("");
    Player player2 = new Player("");


    public void getGame() {
        System.out.println("Skriv in 2 namn för att börja spela! ");
        Player.print1();
        player1.setName();
        Player.print2();
        player2.setName();

        System.out.println("Tryck enter  att " + player1.getName() + " ska kasta din tärning ");
        scanner1.nextLine();
        int dice1 = roll.getRollDice();
        System.out.println(player1.getName() + " fick: " + dice1);


        System.out.println("Tryck enter  att " + player2.getName() + " ska kasta din tärning ");
        scanner1.nextLine();
        int dice2 = roll.getRollDice();
        System.out.println(player2.getName() + " fick en " + dice2 + "a!");


        System.out.println("Tryck enter  att " + player1.getName() + " ska kasta din tärning ");
        scanner1.nextLine();
        int dice3 = roll.getRollDice();
        System.out.println(player1.getName() + " fick en " + dice3 + "a!");


        System.out.println("Tryck enter  att " + player2.getName() + " ska kasta din tärning ");
        scanner1.nextLine();
        int dice4 = roll.getRollDice();
        System.out.println(player2.getName() + " fick en " + dice4 + "a!");

        int sum1 = dice1 + dice3;
        int sum2 = dice2 + dice4;

        System.out.println(player1.getName() + " fick totalt " + sum1 + " poäng!");
        System.out.println(player2.getName() + " fick totalt " + sum2 + " poäng!");
        if (sum1 > sum2) {
            System.out.println(player1.getName() + " vann!");

        } else if (sum1 < sum2) {
            System.out.println(player2.getName() + " vann!");

        } else {
            System.out.println("Det blev oavgjort!");
        }


    }
}



