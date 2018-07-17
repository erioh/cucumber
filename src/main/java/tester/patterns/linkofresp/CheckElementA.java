package tester.patterns.linkofresp;

public class CheckElementA extends CheckElement{

    public boolean check(){
        System.out.println("A");
        return checkNext();
    };

}
