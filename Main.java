public class Main {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();

        //taking input of player A
        // Create Player A
        Player playerA = inputHandler.createPlayer("Player A");

        // Create Player B
        Player playerB = inputHandler.createPlayer("Player B");

        // Check if attributes are identical and then declare draw as it was mentioned in the problem statement that the player who has lower health will attach first
        if (inputHandler.checkForDraw(playerA, playerB)) {
            inputHandler.close();
            return; // Exit if it's a draw
        }
    


        Arena arena = new Arena(playerA, playerB);
        arena.startMatch();

        inputHandler.close();
    }
    
}
