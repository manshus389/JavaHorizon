public class Arena {
    private Player player1;
    private Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startMatch() {
        Player attacker = determineFirstAttacker();
        Player defender = (attacker == player1) ? player2 : player1;
        Dice dice = new Dice();

        while (attacker.isAlive() && defender.isAlive()) {
            System.out.println(attacker + " attacks " + defender);
            attacker.attack(defender, dice);

            if (!defender.isAlive()){
                break;
            }

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        displayMatchSummary();
    }

    private Player determineFirstAttacker() {
        return (player1.getHealth() < player2.getHealth()) ? player1 : player2;
    }

    private void displayMatchSummary() {
        System.out.println("Match Over!");
        System.out.println("Final Status:");
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);

        // Determine and display the winner
    if (player1.isAlive() && !player2.isAlive()) {
        System.out.println("The winner is Player1");
    } else if (player2.isAlive() && !player1.isAlive()) {
        System.out.println("The winner is Player2");
    } else {
        System.out.println("It's a draw!");
    }
    }
}