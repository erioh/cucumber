package tester.patterns.command;

public class CommandDoA extends BaseCommand {
    public CommandDoA(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.doA();
        return true;
    }
}
