package command;

public class TVOnCommand implements Command {
    private TV tv;
    public TVOnCommand(TV tv) { this.tv = tv; }
    public void execute() { tv.on(); }
    public void undo() { tv.off(); }
}