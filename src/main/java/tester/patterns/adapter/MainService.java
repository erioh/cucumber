package tester.patterns.adapter;

import java.util.function.Consumer;

public class MainService implements Consumer<ServiceB> {
    @Override
    public void accept(ServiceB serviceB) {
        System.out.println(serviceB.doB());
    }

    public static void main(String[] args) {
        MainService service = new MainService();
        service.accept(new ImplServiceB());
        service.accept(new AtoBAdapter(new ImplServiceA()));
    }
}
