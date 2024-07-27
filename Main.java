public class Main {
    public static void main(String[] args) {

        InputHandler inputHandler = new InputHandler();

        Player playerA = inputHandler.createPlayer("Player A", "Player 1");
        
        Player playerB = inputHandler.createPlayer("Player B", "Player 2");

        // Check if attributes are identical and then declare draw as it was mentioned in the problem statement that the player who has lower health will attach first
        if (inputHandler.checkForDraw(playerA, playerB)) {
            inputHandler.close();
            return; 
        }

        Arena arena = new Arena(playerA, playerB);
        arena.startMatch();

        inputHandler.close();
    }
    
}
