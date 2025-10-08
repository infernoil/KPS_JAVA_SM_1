package prototype;

public abstract class GameCharacter implements Cloneable {
    public String name;
    public int health;
    public int power;

    public abstract GameCharacter clone();

    public void showInfo() {
        System.out.println(name + " | HP: " + health + " | Power: " + power);
    }
}