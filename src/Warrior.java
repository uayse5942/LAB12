// File: Warrior.java
public class Warrior extends gameCharacter {

    private int armorRating;
    private String weaponType;

    public Warrior(String characterName, int level, int healthPoints,
                   int attackPower, int armorRating, String weaponType) {
        // TODO: super(...)
        super(characterName, level, healthPoints, attackPower);
        // TODO: initialize new fields
        this.armorRating = armorRating;
        this.weaponType = weaponType;
    }

    public int getArmorRating()  { /* TODO */ return armorRating;    }
    public String getWeaponType(){ /* TODO */ return weaponType; }

    @Override
    public void takeDamage(int damage) {
        // TODO: Calculate effectiveDamage = Math.max(0, damage - armorRating)
        int effectiveDamage = Math.max(0, damage - armorRating);
        // TODO: Print "Armor absorbed X damage! Taking Y effective damage."
        int absorbed = Math.min(damage, armorRating);
        System.out.println("Armor absorbed " + absorbed + " damage! Taking " + effectiveDamage + " effective damage.");
        // TODO: Call super.takeDamage(effectiveDamage)
        super.takeDamage(effectiveDamage);
    }

    @Override
    public String attackDescription() {
        // TODO: Return the Warrior-specific attack string
        // Hint: (int)(getAttackPower() * 1.5) for integer damage display
        int totalDamage = (int) (getAttackPower() * 1.5);
        return getCharacterName() + " swings their " + weaponType + " for " + totalDamage + " damage! (Weapon Mastery)";
    }

    @Override
    public void displayStats() {
        // TODO: super.displayStats(), then print armorRating and weaponType
        super.displayStats();
        System.out.println("Armor Rating: " + armorRating + "   | Weapon: " + weaponType);
    }
}