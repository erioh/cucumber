package tester.patterns.composite;

public class Element implements DoSomething {
    String str;
    public Element(String str) {
        this.str = str;
    }

    @Override
    public void doSomething() {
        System.out.println(str);
    }
}
