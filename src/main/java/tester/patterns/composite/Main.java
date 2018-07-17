package tester.patterns.composite;

public class Main {
    public static void main(String[] args) {
        Element a1 = new Element("a1");
        Element a2 = new Element("a2");
        Element a3 = new Element("a3");
        Element a4 = new Element("a4");
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();
        b1.add(a1);
        b2.add(a2);
        b3.add(a3);
        b3.add(b1);
        b3.add(b2);
        b3.add(a4);
        b3.doSomething();
    }
}
