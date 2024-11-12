package se.erik.game;

import se.erik.house.House;
import se.erik.model.Burglar;
import se.erik.model.Resident;

public class Main {
    public static void main(String[] args) {
        Resident resident = new Resident();
        Burglar burglar = new Burglar();
        Fight fight = new Fight(resident,burglar);
        House house = new House(0,0,resident,burglar, fight);

        Game game = new Game(resident,house,fight);

        game.getGame();
    }
}
