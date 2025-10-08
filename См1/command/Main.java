package command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        TV tv = new TV();

        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();
        remote.pressUndo();

        remote.setCommand(new TVOnCommand(tv));
        remote.pressButton();
        remote.pressUndo();
    }
}