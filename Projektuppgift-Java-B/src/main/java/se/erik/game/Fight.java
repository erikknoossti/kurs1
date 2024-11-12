package se.erik.game;

import se.erik.house.House;
import se.erik.model.Burglar;
import se.erik.model.Resident;

import static se.erik.game.Game.input;
import static se.erik.game.Game.running;

public class Fight {
    private Resident resident;
    private Burglar burglar;

    public Fight(Resident resident, Burglar burglar) {
        this.resident = resident;
        this.burglar = burglar;
    }

    //MÖTA OCH SLÅSS MOT INBROTTSTJUVEN
    public void encounter() {
        boolean battle = true;
        System.out.println("The resident ran in to the Burglar!");
        System.out.println("Type 1 to attack or type 2 to leave ");

        while (battle) {
            String fightInput = input.nextLine();
            switch (fightInput) {
                case "1" -> {
                    resident.punch(burglar);
                    System.out.println("The Burglar now has " + burglar.getHealth() + " hp left");
                    burglar.punch(resident);
                    System.out.println("The Resident now has " + resident.getHealth() + " hp left");
                }
                case "2" -> {
                    System.out.println("You ran away from the burglar");
                    battle = false;
                }
                default -> System.out.println("Invalid input, type again");
            }
            if (!resident.isConsious()) {
                System.out.println("The resident died, game over");
                battle = false;
            } else if (!burglar.isConsious()) {
                System.out.println("The burglar is unconsious, go to the office to call the police!");
                battle = false;
            }
        }
    }


    public void callPolice() {
        System.out.println("Type 1 to call the police to arrest the burglar\nType 2 to not call the police");
        while (running) {
            String call = input.nextLine();
            switch (call) {
                case "1" -> {
                    System.out.println("The resident has called the police and they are on their way to your house!");
                    System.out.println("10 minutes later the police arrived and arrested the burglar\nCongratulations you won!");
                    System.exit(0);
                    return;
                }
                case "2" -> {
                    System.out.println("You didnt choose to call the police and the burglar woke up and knocked out the resident\nGame over!");
                    return;
                }
                default -> System.out.println("Invalid input, type again");
            }
        }
    }


}
