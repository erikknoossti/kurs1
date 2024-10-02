package projektTest;
import java.util.Random;
public class Roll {
    Random random = new Random();
    private int rollDice;

    public Roll(int rollDice){
        this.rollDice = rollDice;

    }
    public int getRollDice(){
        return random.nextInt(6)+1;
    }

    }

