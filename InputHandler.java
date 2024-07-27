import java.util.Scanner;
public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public int getIntInput(String prompt) {
        int value;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0 && value <= 100) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
        }
        return value;
    }

    public Player createPlayer(String playerName) {
        int health = getIntInput("Enter health for " + playerName + " (1-100):");
        int strength = getIntInput("Enter strength for " + playerName + " (1-100):");
        int attack = getIntInput("Enter attack for " + playerName + " (1-100):");
        return new Player(health, strength, attack);
    }

    public boolean checkForDraw(Player playerA, Player playerB) {
        if (areAttributesIdentical(playerA, playerB)) {
            System.out.println("Draw: Both players have identical attributes.");
            return true;
        }
        return false;
    }

    private boolean areAttributesIdentical(Player p1, Player p2) {
        return p1.getHealth() == p2.getHealth() &&
               p1.getStrength() == p2.getStrength() &&
               p1.getAttack() == p2.getAttack();
    }

    public void close() {
        scanner.close();
    }
    
}
