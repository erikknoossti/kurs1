package se.erik.projektuppgift;
import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();
        boolean loop = true;

        Player.print1();
        String firstPlayer = scanner1.nextLine();
        Player.print2();
        String secondPlayer = scanner2.nextLine();
        Player player1 = new Player(firstPlayer);
        Player player2 = new Player(secondPlayer);
        int operation = 0;

        int roll = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int roll3 = random.nextInt(6) + 1;
        int roll4 = random.nextInt(6) + 1;
        int sum = roll + roll3;
        int sum2 = roll2 + roll4;

        System.out.println("Tryck på 1 för att " + firstPlayer + " ska kasta sin första tärning! ");

        while(loop){
            operation = scanner1.nextInt();
            switch (operation){

                case 1:
                    System.out.println(firstPlayer + " kastade en " + roll + "a!");
                    System.out.println("Tryck på 2 för att " + secondPlayer + " ska kasta sin första tärning! ");
                    break;

                case 2:
                    System.out.println(secondPlayer + " kastade en " + roll2 + "a!");
                    System.out.println("Tryck på 3 för att " + firstPlayer + " ska kasta sin andra tärning! ");
                    break;

                case 3:
                    System.out.println(firstPlayer + " kastade en " + roll3 + "a!");
                    System.out.println("Tryck på 4 för att " + secondPlayer + " ska kasta sin andra tärning! ");
                    break;

                case 4:
                    System.out.println(player2.getPlayer() + " kastade en " + roll4 + "a!");
                    System.out.println(player1.getPlayer() + " fick " + sum + " poäng sammanlagt!");
                    System.out.println(player2.getPlayer() + " fick " + sum2 + " poäng sammanlagt!");

                    if(sum > sum2){
                        System.out.println(player1.getPlayer() + " vann!");
                    } else if(sum2 > sum){
                        System.out.println(player2.getPlayer() + " vann!");
                }else{
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










