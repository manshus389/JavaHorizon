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
        if (player1.getHealth() < player2.getHealth()) {
            return player1;
        } else if (player2.getHealth() < player1.getHealth()) {
            return player2;
        } else {
            // In case of equal health, compare combined attack and defense
            int player1Combined = player1.getAttack() + player1.getStrength();
            int player2Combined = player2.getAttack() + player2.getStrength();

            if (player1Combined < player2Combined) {
                return player1;
            } else if (player2Combined < player1Combined) {
                return player2;
            } else {
                // If combined values are also equal, return player1 by default
                return player1;
            }
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