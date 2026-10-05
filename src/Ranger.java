// File: Ranger.java
public class Ranger extends gameCharacter {

    private int arrowCount;
    private double criticalHitChance;

    public Ranger(String characterName, int level, int healthPoints,
                  int attackPower, int arrowCount, double criticalHitChance) {
        // TODO
        super(characterName, level, healthPoints, attackPower);
        this.arrowCount = arrowCount;
        this.criticalHitChance = criticalHitChance;
    }

    public int getArrowCount()          { /* TODO */ return arrowCount;   }
    public double getCriticalHitChance(){ /* TODO */ return criticalHitChance; }

    @Override
    public String attackDescription() {
        // TODO: Return the Ranger-specific attack string
        return getCharacterName() + " fires an arrow for " + getAttackPower() + " damage! (Crit Chance: " + criticalHitChance + "%)";
    }

    public void shootArrow() {
        // TODO: If arrowCount > 0, decrement and print attackDescription()
        //       Else print "<characterName> has no arrows left!"
        if (arrowCount > 0) {
            arrowCount--;
            System.out.println(attackDescription());
        } else {
            System.out.println(getCharacterName() + " has no arrows left!");
        }
    }

    @Override
    public void displayStats() {
        // TODO: super.displayStats(), then print arrowCount and criticalHitChance
        super.displayStats();
        System.out.println("Arrows: " + arrowCount + "          | Crit Chance: " + criticalHitChance + "%");
    }
}
