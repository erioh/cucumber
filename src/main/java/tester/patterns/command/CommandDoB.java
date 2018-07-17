package tester.patterns.command;

public class CommandDoB extends BaseCommand {
    public CommandDoB(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.doB();
        return true;
    }
}
