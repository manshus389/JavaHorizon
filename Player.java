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
        int damage = attack * dice.roll();
        defender.defend(damage, dice);
    }

    public void defend(int incomingDamage, Dice dice) {
        int defended = strength * dice.roll();
        health = Math.max(health - Math.max(incomingDamage - defended, 0), 0);
    }

    public int getHealth() { return health; }
    public int getStrength() { return strength; }
    public int getAttack() { return attack; }

    @Override
    public String toString() {
        return "Player [health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
    }
}
