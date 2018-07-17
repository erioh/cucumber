package tester.patterns.command;

public abstract class BaseCommand {
    protected Editor editor;
    public BaseCommand(Editor editor) {
        this.editor = editor;
    }

    public abstract boolean execute();
}
