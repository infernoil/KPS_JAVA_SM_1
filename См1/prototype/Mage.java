package prototype;

public class Mage extends GameCharacter {
    String spell;

    public Mage(String name, int health, int power, String spell) {
        this.name = name; this.health = health; this.power = power; this.spell = spell;
    }

    public GameCharacter clone() {
        return new Mage(this.name, this.health, this.power, this.spell);
    }
}