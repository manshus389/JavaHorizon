import java.util.Scanner;
public class InputHandler {

    private Scanner scanner = new Scanner(System.in);

    public int getHealth(String playerName) {
        System.out.println("Enter health for " + playerName + ":");
        return scanner.nextInt();
    }

    public int getStrength(String playerName) {
        System.out.println("Enter strength for " + playerName + ":");
        return scanner.nextInt();
    }

    public int getAttack(String playerName) {
        System.out.println("Enter attack for " + playerName + ":");
        return scanner.nextInt();
    }

    public void close() {
        scanner.close();
    }
    
}
