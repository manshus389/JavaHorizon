public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void attack(Player defender, Dice dice) {
        int attackRoll = dice.roll();
        int damage = this.attack * attackRoll;
        defender.defend(damage, dice);
    }

    public void defend(int incomingDamage, Dice dice) {
        int defenseRoll = dice.roll();
        int defended = this.strength * defenseRoll;
        int damageTaken = Math.max(incomingDamage - defended, 0);
        this.health -= damageTaken;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Player [health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
    }
}
