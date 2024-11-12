package se.erik.game;

import se.erik.house.House;
import se.erik.model.Resident;

import java.util.Scanner;

public class Game {
    public static Scanner input = new Scanner(System.in);
    public static Boolean running = true;
    private House house;
    private Resident resident;
    private Fight fight;

    public Game(Resident resident, House house, Fight fight) {
        this.resident = resident;
        this.house = house;
        this.fight = fight;
    }


    public void getGame() {
        printWelcome();
        start();
    }

    //VÄLKOMSTMENY
    public void printWelcome() {
        System.out.println("The resident wake up in the living room on the couch in the middle of the night and hear weird sounds coming from the hallway.");
        System.out.println("The resident notice a burglar broke in to the house and have to act fast");
        System.out.println("The resident starts in the living room, what room is the resident going to first?");
        System.out.println("type:\nlivingroom -> living room\nkitchen -> kitchen\nbedroom -> bedroom\nhallway -> hallway\noffice -> office");
    }

    //VÄLJA VILKET RUM MAN VILL GÅ TILL
    public void start() {
        while (running && resident.isConsious()) {
            String direction = input.nextLine();
            switch (direction) {
                case "kitchen" -> {
                    house.kitchen();
                    places();
                }
                case "livingroom" -> {
                    house.livingRoom();
                    places();
                }
                case "bedroom" -> {
                    house.bedRoom();
                    places();
                }
                case "hallway" -> {
                    house.hallWay();
                    fight.encounter();
                    places();
                }
                case "office" -> {
                    house.office();
                    places();
                }
                default -> System.out.println("Invalid input, type again");

            }
        }
    }

    //VÄLJA VART MAN VILL GÅ
    public void places() {
        while (running && resident.isConsious()) {
            String direction = input.nextLine();
            switch (direction) {
                case "north" -> house.moveNorth();
                case "south" -> house.moveSouth();
                case "east" -> house.moveEast();
                case "west" -> house.moveWest();
                case "livingroom" -> {
                    house.livingRoom();
                    start();
                }
                case "quit" -> {
                    System.out.println("Game over");
                    return;
                }
                default -> System.out.println("Invalid input, type again");
            }

        }
    }


}
