package tester.patterns.factorymethod;

public class SeaFactory extends FactoryMethod {
    @Override
    public Transport getTransport() {
        return new Ship();
    }
}
