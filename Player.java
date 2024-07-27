public class Player {
    private int health;
    private int strength;
    private int attack;
    private String name;

    public Player(int health, int strength, int attack, String name) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
    }
       

    public boolean isAlive() {
        return this.health > 0;
    }

    public void attack(Player defender, Dice dice) {
        int attackerRoll = dice.roll();
        int defenderRoll = dice.roll();
        System.out.println(name + " [" + this + "] attacks " + defender.name + " [" + defender + "]");
        System.out.println("Attacker dice roll result: " + attackerRoll);
        System.out.println("Defender dice roll result: " + defenderRoll);
        int damage = attack * attackerRoll;
        defender.defend(damage, defenderRoll);
    }


    

    public void defend(int incomingDamage, int defenderRoll) {
        int defended = strength * defenderRoll;
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
