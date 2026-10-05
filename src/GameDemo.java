// File: GameDemo.java
public class GameDemo {
    public static void main(String[] args) {
        //add exercise 2
        // TODO: Create Warrior "Thorin", level 10, 250 HP, 80 attack, 35 armor, "Axe"
        Warrior thorin = new Warrior("Thorin", 10, 250, 80, 35, "Axe");

        // TODO: Create Mage "Elara", level 10, 150 HP, 120 attack, 200 mana, "Fire"
        Mage elara = new Mage("Elara", 10, 150, 120, 200, "Fire");

        // TODO: Create Ranger "Sylvan", level 10, 190 HP, 95 attack, 30 arrows, 22.5% crit
        Ranger sylvan = new Ranger("Sylvan", 10, 190, 95, 30, 22.5);

        // TODO: Display stats for all three characters
        thorin.displayStats();
        elara.displayStats();
        sylvan.displayStats();
        System.out.println("=============================");

        // TODO: Deal 60 damage to the Warrior and print remaining HP
        thorin.takeDamage(60);
        System.out.println(thorin.getCharacterName() + " remaining HP: " + thorin.getHealthPoints());

        // TODO: Cast a spell with the Mage
        elara.castSpell();

        // TODO: Shoot two arrows with the Ranger
        sylvan.shootArrow();
        sylvan.shootArrow();
    }
}