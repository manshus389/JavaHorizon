public class Main {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();

        //taking input of player A
        int healthA = inputHandler.getHealth("Player A");
        int strengthA = inputHandler.getStrength("Player A");
        int attackA = inputHandler.getAttack("Player A");

        // taking input of Player B
        int healthB = inputHandler.getHealth("Player B");
        int strengthB = inputHandler.getStrength("Player B");
        int attackB = inputHandler.getAttack("Player B");

        Player playerA = new Player(healthA, strengthA, attackA);
        Player playerB = new Player(healthB, strengthB, attackB);


        Arena arena = new Arena(playerA, playerB);
        arena.startMatch();

        inputHandler.close();
    }
    
}
