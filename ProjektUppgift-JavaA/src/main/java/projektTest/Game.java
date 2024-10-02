package projektTest;
import java.util.Scanner;

public class Game {
    private boolean loop = true;
    private int operation = 0;
    Scanner scanner1 = new Scanner(System.in);
    Roll roll1 = new Roll(0);
    Player player1 = new Player("");
    Player player2 = new Player("");

    public Game(boolean loop, int operation) {
        this.loop = loop;
        this.operation = operation;


    }

    int dice1 = roll1.getRollDice();
    int dice2 = roll1.getRollDice();
    int dice3 = roll1.getRollDice();
    int dice4 = roll1.getRollDice();

    int sum1 = dice1 + dice3;
    int sum2 = dice2 + dice4;


    public void getGame() {
        System.out.println("Skriv in 2 namn för att börja spela! ");
        Player.print1();
        player1.setName("");
        Player.print2();
        player2.setName("");
        System.out.println("Tryck på 1 för att " + player1.getName() + " ska kasta sin tärning ");

        while (loop) {
        operation = scanner1.nextInt();
        switch (operation) {
            case 1:
                System.out.println(player1.getName() + " fick en " + dice1 + "a!");
                System.out.println("Tryck på 2 för att " + player2.getName() + " ska kasta sin tärning");
                break;

            case 2:
                System.out.println(player2.getName() + " fick en " + dice2 + "a!");
                System.out.println("Tryck på 3 för att " + player1.getName() + " ska kasta sin andra tärning!");
                break;

            case 3:
                System.out.println(player1.getName() + " fick en " + dice3 + "a!");
                System.out.println("Tryck på 4 för att " + player2.getName() + " ska kasta sin andra tärning!");
                break;

            case 4:
                System.out.println(player2.getName() + " fick en " + dice4 + "a!");
                System.out.println(player1.getName() + " fick totalt " + sum1 + " poäng!");
                System.out.println(player2.getName() + " fick totalt " + sum2 + " poäng!");
                if (sum1 > sum2) {
                    System.out.println(player1.getName() + " vann!");

                } else if (sum1 < sum2) {
                    System.out.println(player2.getName() + " vann!");

                    } else {
                    System.out.println("Det blev oavgjort!");
                    }
                    System.out.println("Tryck 5 för att avsluta!");
                    break;
            case 5:
                loop = false;


                }
            }

        }

    }

