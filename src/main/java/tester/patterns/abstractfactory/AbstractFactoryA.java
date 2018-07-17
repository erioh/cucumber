package tester.patterns.abstractfactory;

public class AbstractFactoryA implements AbstractFactory{
    @Override
    public Chair getChair() {
        return new ChairA();
    }
}
