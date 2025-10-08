package prototype;

public class Main {
    public static void main(String[] args) {
        Warrior warriorPrototype = new Warrior("Warrior", 100, 50, "Sword");
        Mage magePrototype = new Mage("Mage", 80, 70, "Fireball");

        Warrior conan = (Warrior) warriorPrototype.clone();
        conan.name = "Conan";

        Mage gandalf = (Mage) magePrototype.clone();
        gandalf.name = "Gandalf";

        conan.showInfo();
        gandalf.showInfo();
    }
}