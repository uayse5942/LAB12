// File: GameCharacter.java
public class gameCharacter {

    private String characterName;
    private int level;
    private int healthPoints;
    private int attackPower;

    public gameCharacter(String characterName, int level,
                         int healthPoints, int attackPower) {
        // TODO
        this.characterName = characterName;
        this.level = level;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
    }

    // Getters
    public String getCharacterName() { /* TODO */ return characterName; }
    public int getLevel()            { /* TODO */ return level;    }
    public int getHealthPoints()     { /* TODO */ return healthPoints;    }
    public int getAttackPower()      { /* TODO */ return attackPower;    }

    public boolean isAlive() {
        // TODO: Return true if healthPoints > 0
        return healthPoints > 0;
    }

    public void takeDamage(int damage) {
        // TODO: Subtract damage from healthPoints, but never go below 0
        // Hint: healthPoints = Math.max(0, healthPoints - damage);
        this.healthPoints = Math.max(0, this.healthPoints - damage);
    }

    public void displayStats() {
        System.out.println("=============================");
        // TODO: Print characterName, level, healthPoints, attackPower
        System.out.println("Name: " + characterName + "         | Level: " + level);
        System.out.println("HP: " + healthPoints + "            | Attack: " + attackPower);
    }

    public String attackDescription() {
        // TODO: Return "<characterName> performs a basic attack for <attackPower> damage."
        return characterName + " performs a basic attack for " + attackPower + " damage.";
    }
}
