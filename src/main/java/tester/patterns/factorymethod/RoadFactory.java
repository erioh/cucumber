package tester.patterns.factorymethod;

public class RoadFactory extends FactoryMethod {
    @Override
    public Transport getTransport() {
        return new Truck();
    }
}
