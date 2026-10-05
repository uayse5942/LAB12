# Lab 12: Inheritance, Polymorphism, and Interfaces (Part 2)

### Course: CENG112 Computer Programming II (Java)
### Topic: Inheritance Basics, Superclass/Subclass Relationships, and Method Overriding

---

## Lab Setup

- **IDE:** IntelliJ IDEA, Eclipse, or VS Code with Java Extension Pack
- **No external libraries required** — standard Java only
- Each exercise that contains multiple classes can either use separate files or **nested/inner class structure** as shown in the starter code

---

## Exercise: Video Game Character System

**Objective:** Design a multi-subclass inheritance system where a single superclass is extended by multiple independent subclasses, each with unique behavior. Practice method overriding, `super` usage, and the is-a relationship test.

---

**Problem Statement:**

You are building the character system for a role-playing video game. All characters share core stats, but each character class has unique abilities and combat behavior.

**Class hierarchy:**

```
GameCharacter
    ├── Warrior
    ├── Mage
    └── Ranger
```

1. **`GameCharacter`** (superclass):
   - `private String characterName`
   - `private int level`
   - `private int healthPoints`
   - `private int attackPower`
   - Parameterized constructor for all fields
   - Public getters for all fields
   - `public boolean isAlive()` — returns `true` if `healthPoints > 0`
   - `public void takeDamage(int damage)` — subtracts damage from `healthPoints` (minimum 0)
   - `public void displayStats()` — prints all base stats in a formatted block
   - `public String attackDescription()` — returns `"<characterName> performs a basic attack for <attackPower> damage."`

2. **`Warrior`** extends `GameCharacter`:
   - `private int armorRating` (reduces incoming damage)
   - `private String weaponType` (e.g., `"Sword"`, `"Axe"`)
   - Parameterized constructor using `super(...)`
   - **Override** `takeDamage(int damage)` so that effective damage = `max(0, damage - armorRating)`, then calls `super.takeDamage(effectiveDamage)`
   - **Override** `attackDescription()` — returns `"<name> swings their <weaponType> for <attackPower * 1.5> damage! (Weapon Mastery)"`
   - **Override** `displayStats()` — calls `super.displayStats()`, then prints armor rating and weapon type

3. **`Mage`** extends `GameCharacter`:
   - `private int manaPoints`
   - `private String spellSchool` (e.g., `"Fire"`, `"Ice"`, `"Lightning"`)
   - Parameterized constructor using `super(...)`
   - **Override** `attackDescription()` — returns `"<name> casts a <spellSchool> spell for <attackPower * 2> damage! (costs 30 mana)"`
   - A method `public void castSpell()` that deducts 30 from `manaPoints` (minimum 0) and prints the attack description
   - **Override** `displayStats()` — calls `super.displayStats()`, then prints mana and spell school

4. **`Ranger`** extends `GameCharacter`:
   - `private int arrowCount`
   - `private double criticalHitChance` (a percentage, e.g., `25.0` means 25%)
   - Parameterized constructor using `super(...)`
   - **Override** `attackDescription()` — returns `"<name> fires an arrow for <attackPower> damage! (Crit Chance: <criticalHitChance>%)"`
   - A method `public void shootArrow()` that decrements `arrowCount` by 1 (if > 0) and prints the attack description, or prints `"<name> has no arrows left!"` if `arrowCount == 0`
   - **Override** `displayStats()` — calls `super.displayStats()`, then prints arrow count and crit chance

5. Write a `GameDemo` class with a `main` method that:
   - Creates one of each character type
   - Calls `displayStats()` on all three
   - Demonstrates `takeDamage()` on the `Warrior` (show armor reduction)
   - Calls `castSpell()` on the `Mage`
   - Calls `shootArrow()` on the `Ranger` twice

---

**Starter Code:**

```java
// File: GameCharacter.java
public class GameCharacter {

    private String characterName;
    private int level;
    private int healthPoints;
    private int attackPower;

    public GameCharacter(String characterName, int level,
                         int healthPoints, int attackPower) {
        // TODO
    }

    // Getters
    public String getCharacterName() { /* TODO */ return null; }
    public int getLevel()            { /* TODO */ return 0;    }
    public int getHealthPoints()     { /* TODO */ return 0;    }
    public int getAttackPower()      { /* TODO */ return 0;    }

    public boolean isAlive() {
        // TODO: Return true if healthPoints > 0
        return false;
    }

    public void takeDamage(int damage) {
        // TODO: Subtract damage from healthPoints, but never go below 0
        // Hint: healthPoints = Math.max(0, healthPoints - damage);
    }

    public void displayStats() {
        System.out.println("=============================");
        // TODO: Print characterName, level, healthPoints, attackPower
    }

    public String attackDescription() {
        // TODO: Return "<characterName> performs a basic attack for <attackPower> damage."
        return null;
    }
}
```

```java
// File: Warrior.java
public class Warrior extends GameCharacter {

    private int armorRating;
    private String weaponType;

    public Warrior(String characterName, int level, int healthPoints,
                   int attackPower, int armorRating, String weaponType) {
        // TODO: super(...)
        // TODO: initialize new fields
    }

    public int getArmorRating()  { /* TODO */ return 0;    }
    public String getWeaponType(){ /* TODO */ return null; }

    @Override
    public void takeDamage(int damage) {
        // TODO: Calculate effectiveDamage = Math.max(0, damage - armorRating)
        // TODO: Print "Armor absorbed X damage! Taking Y effective damage."
        // TODO: Call super.takeDamage(effectiveDamage)
    }

    @Override
    public String attackDescription() {
        // TODO: Return the Warrior-specific attack string
        // Hint: (int)(getAttackPower() * 1.5) for integer damage display
        return null;
    }

    @Override
    public void displayStats() {
        // TODO: super.displayStats(), then print armorRating and weaponType
    }
}
```

```java
// File: Mage.java
public class Mage extends GameCharacter {

    private int manaPoints;
    private String spellSchool;

    public Mage(String characterName, int level, int healthPoints,
                int attackPower, int manaPoints, String spellSchool) {
        // TODO
    }

    public int getManaPoints()    { /* TODO */ return 0;    }
    public String getSpellSchool(){ /* TODO */ return null; }

    @Override
    public String attackDescription() {
        // TODO: Return the Mage-specific attack string
        return null;
    }

    public void castSpell() {
        // TODO: If manaPoints >= 30, deduct 30 and print attackDescription()
        //       Else print "<characterName> is out of mana!"
    }

    @Override
    public void displayStats() {
        // TODO: super.displayStats(), then print manaPoints and spellSchool
    }
}
```

```java
// File: Ranger.java
public class Ranger extends GameCharacter {

    private int arrowCount;
    private double criticalHitChance;

    public Ranger(String characterName, int level, int healthPoints,
                  int attackPower, int arrowCount, double criticalHitChance) {
        // TODO
    }

    public int getArrowCount()          { /* TODO */ return 0;   }
    public double getCriticalHitChance(){ /* TODO */ return 0.0; }

    @Override
    public String attackDescription() {
        // TODO: Return the Ranger-specific attack string
        return null;
    }

    public void shootArrow() {
        // TODO: If arrowCount > 0, decrement and print attackDescription()
        //       Else print "<characterName> has no arrows left!"
    }

    @Override
    public void displayStats() {
        // TODO: super.displayStats(), then print arrowCount and criticalHitChance
    }
}
```

```java
// File: GameDemo.java
public class GameDemo {
    public static void main(String[] args) {

        // TODO: Create Warrior "Thorin", level 10, 250 HP, 80 attack, 35 armor, "Axe"
        // TODO: Create Mage "Elara", level 10, 150 HP, 120 attack, 200 mana, "Fire"
        // TODO: Create Ranger "Sylvan", level 10, 190 HP, 95 attack, 30 arrows, 22.5% crit

        // TODO: Display stats for all three characters

        // TODO: Deal 60 damage to the Warrior and print remaining HP
        // TODO: Cast a spell with the Mage
        // TODO: Shoot two arrows with the Ranger

    }
}
```

---

**Expected Output:**

```
=============================
Name: Thorin       | Level: 10
HP: 250            | Attack: 80
Armor Rating: 35   | Weapon: Axe
=============================
Name: Elara        | Level: 10
HP: 150            | Attack: 120
Mana: 200          | Spell School: Fire
=============================
Name: Sylvan       | Level: 10
HP: 190            | Attack: 95
Arrows: 30         | Crit Chance: 22.5%
=============================
Armor absorbed 35 damage! Taking 25 effective damage.
Thorin remaining HP: 225
Elara casts a Fire spell for 240 damage! (costs 30 mana)
Sylvan fires an arrow for 95 damage! (Crit Chance: 22.5%)
Sylvan fires an arrow for 95 damage! (Crit Chance: 22.5%)
```

---

**Hints:**
- In `Warrior.takeDamage()`, compute effective damage first, then call `super.takeDamage(effectiveDamage)` — this correctly updates the `healthPoints` stored in the superclass
- Use `getAttackPower()` (not direct field access) inside subclass methods, since `attackPower` is `private` in `GameCharacter`
- Test `isAlive()` after `takeDamage()` to make sure the floor of 0 works correctly

---
