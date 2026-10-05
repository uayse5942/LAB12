// File: Mage.java
public class Mage extends gameCharacter {

    private int manaPoints;
    private String spellSchool;

    public Mage(String characterName, int level, int healthPoints,
                int attackPower, int manaPoints, String spellSchool) {
        // TODO
        super(characterName, level, healthPoints, attackPower);
        this.manaPoints = manaPoints;
        this.spellSchool = spellSchool;
    }

    public int getManaPoints()    { /* TODO */ return manaPoints;    }
    public String getSpellSchool(){ /* TODO */ return spellSchool; }

    @Override
    public String attackDescription() {
        // TODO: Return the Mage-specific attack string
        int totalDamage = getAttackPower() * 2;
        return getCharacterName() + " casts a " + spellSchool + " spell for " + totalDamage + " damage! (costs 30 mana)";
    }

    public void castSpell() {
        // TODO: If manaPoints >= 30, deduct 30 and print attackDescription()
        //       Else print "<characterName> is out of mana!"
        if (manaPoints >= 30) {
            manaPoints -= 30;
            System.out.println(attackDescription());
        } else {
            System.out.println(getCharacterName() + " is out of mana!");
        }
    }

    @Override
    public void displayStats() {
        // TODO: super.displayStats(), then print manaPoints and spellSchool
        super.displayStats();
        System.out.println("Mana: " + manaPoints + "            | Spell School: " + spellSchool);
    }
}
