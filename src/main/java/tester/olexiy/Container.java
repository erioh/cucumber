package tester.olexiy;

public class Container {
    private Class clazz;
    private Object object;

    public Container(Object object) {
        clazz = object.getClass();
        this.object = object;
    }

}
