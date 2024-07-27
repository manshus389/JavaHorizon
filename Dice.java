import java.util.Random;

public class Dice {
    private Random random = new Random();

    public int roll() {
        int rollValue = random.nextInt(6) + 1; 
        return rollValue;
    }

}
