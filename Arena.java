public class Arena {
    private Player player1;
    private Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startMatch() {
        Dice dice = new Dice();

        Player attacker = determineFirstAttacker();
        Player defender = (attacker == player1) ? player2 : player1;

        while (player1.isAlive() && player2.isAlive()) {
            System.out.println(attacker + " attacks " + defender);
            attacker.attack(defender, dice);
            if (!defender.isAlive()) break;

            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        displayMatchSummary();
    }

    private Player determineFirstAttacker() {
        int roll1 = new Dice().roll();
        int roll2 = new Dice().roll();
        System.out.println("Player 1 rolls: " + roll1);
        System.out.println("Player 2 rolls: " + roll2);

        if (roll1 > roll2) {
            return player1;
        } else if (roll2 > roll1) {
            return player2;
        } else {
            // In case of a tie, re-roll
            return determineFirstAttacker();
        }
    }

    private void displayMatchSummary() {
        System.out.println("Match Over!");
        System.out.println("Final Status:");
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);

       
    if (player1.isAlive() && !player2.isAlive()) {
        System.out.println("The winner is Player1");
    } else if (player2.isAlive() && !player1.isAlive()) {
        System.out.println("The winner is Player2");
    } else {
        System.out.println("It's a draw!");
    }
    }
}