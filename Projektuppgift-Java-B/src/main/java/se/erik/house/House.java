package se.erik.house;

import se.erik.game.Fight;
import se.erik.model.Burglar;
import se.erik.model.Resident;

import static se.erik.game.Game.input;
import static se.erik.game.Game.running;

public class House {
    //ATTRIBUT
    private int x, y;
    private int prevX, prevY;
    private boolean isPanFound = false;
    private Fight fight;
    private Resident resident;
    private Burglar burglar;

    //KONSTRUKTOR
    public House(int x, int y, Resident resident, Burglar burglar, Fight fight) {
        this.x = x;
        this.y = y;
        this.prevX = x;
        this.prevY = y;
        this.resident = resident;
        this.burglar = burglar;
        this.fight = fight;
    }

    public void moveNorth() {
        savePrevPosition();
        if (y < 5) {
            y++;
            System.out.println("you went North " + x + "," + y);
        } else {
            System.out.println("You cant go any further north");
            resetPrevPosition();
        }
    }

    public void moveSouth() {
        savePrevPosition();
        if (y > 0) {
            y--;
            System.out.println("You went south " + x + "," + y);
        } else {
            System.out.println("You cant go any further south");
            resetPrevPosition();
        }
    }

    public void moveEast() {
        savePrevPosition();
        if (x < 5) {
            x++;
            System.out.println("You went east " + x + "," + y);
        } else {
            System.out.println("You cant go any further east");
            resetPrevPosition();
        }
    }

    public void moveWest() {
        savePrevPosition();
        if (x > 0) {
            x--;
            System.out.println("You went west " + x + "," + y);
        } else {
            System.out.println("You cant go any further west");
            resetPrevPosition();
        }
    }

    //GÅ TILL KÖKET
    public void kitchen() {
        if (isPanFound == false) {
            takePan();

        } else {
            x = 0;
            y = 0;
            System.out.println("you are now in the Kitchen " + x + "," + y);
        }
    }

    //GÅ TILL KONTORET
    public void office() {
        x = 0;
        y = 0;
        System.out.println("You are now in the Office " + x + "," + y);
        if (!burglar.isConsious()) {
            fight.callPolice();
        }
    }

    //GÅ TILL VARDAGSRUMMET
    public void livingRoom() {
        x = 0;
        y = 0;
        System.out.println("You are now in the Living Room " + x + "," + y);
    }

    //GÅ TILL SOVRUMMET
    public void bedRoom() {
        x = 0;
        y = 0;
        System.out.println("You are now in the Bedroom " + x + "," + y);
    }

    //GÅ TILL HALLEN
    public void hallWay() {
        x = 0;
        y = 0;
        System.out.println("You are now in the Hallway " + x + "," + y);
    }

    //SPARA TIDIGARE POSITION
    public void savePrevPosition() {
        prevX = x;
        prevY = y;
    }

    //GÅ TILL SPARADE TIDIGARE POSITION
    public void resetPrevPosition() {
        x = prevX;
        y = prevY;
        System.out.println("You are now back at " + x + "," + y);
    }

    //VÄLJA ATT TA UPP STEKPANNAN
    public void takePan() {
        System.out.println("The resident just found a frying pan\nIf you pick it up the resident will do 10 damage instead of 5");
        System.out.println("Press 1 to pick it up, or press 2 to not");
        while (running) {

            String panInput = input.nextLine();
            switch (panInput) {
                case "1" -> {
                    resident.addDamage(5);
                    isPanFound = true;
                    System.out.println("Damage = " + resident.getDamage());
                    System.out.println("The resident picked up the pan\nYou should go to the hallway to defeat the burglar!");
                    return;
                }
                case "2" -> {
                    System.out.println("You made a mistake! now the resident cant defeat the burglar!");
                    return;
                }
                default -> System.out.println("Invalid input, type again");


            }
        }
    }

}






