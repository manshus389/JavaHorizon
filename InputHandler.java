import java.util.Scanner;
public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }

    public Player createPlayer(String playerName) {
        System.out.println("Enter health for " + playerName + ":");
        int health = getIntInput();
        System.out.println("Enter strength for " + playerName + ":");
        int strength = getIntInput();
        System.out.println("Enter attack for " + playerName + ":");
        int attack = getIntInput();
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
