package tester.patterns.linkofresp;

public abstract class CheckElement {
    private CheckElement element;
    public CheckElement linkWith(CheckElement element) {
        this.element = element;
        return element;
    }

    public abstract boolean check();

    public boolean checkNext() {
        if (element == null) {
            return true;
        }
        return element.check();
    }

}
