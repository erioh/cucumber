package tester.patterns.linkofresp;

public class Main {

    public static void main(String[] args) {
        CheckElement checkElementA = new CheckElementA();
        CheckElement checkElementB = new CheckElementB();
        checkElementA.linkWith(checkElementB);
        System.out.println(checkElementA.check());
    }
}
