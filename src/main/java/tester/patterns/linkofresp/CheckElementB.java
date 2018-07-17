package tester.patterns.linkofresp;

public class CheckElementB extends CheckElement{
    public boolean check(){
        System.out.println("B");
        return checkNext();
    };

}
