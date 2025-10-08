package prototype;

public class Warrior extends GameCharacter {
    String weapon;

    public Warrior(String name, int health, int power, String weapon) {
        this.name = name; this.health = health; this.power = power; this.weapon = weapon;
    }

    public GameCharacter clone() {
        return new Warrior(this.name, this.health, this.power, this.weapon);
    }
}