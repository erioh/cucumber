package tester.patterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println(deliver(new SeaFactory()));
    }

    public static String deliver(FactoryMethod factoryMethod) {
        return factoryMethod.getTransport().toString();
    }
}
