package tester.patterns.adapter;

public class AtoBAdapter implements ServiceB{
    private ServiceA serviceA;
    public AtoBAdapter(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public String doB() {
        String s ="";
        if (serviceA.doA() == 0) {
            s = "adapter";
        }
        return s;
    }
}
