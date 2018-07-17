package tester.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements  DoSomething {
    private List<DoSomething> elementList;

    public Box() {
        elementList = new ArrayList<>();
    }

    @Override
    public void doSomething() {
        for (DoSomething element : getElementList()) {
            element.doSomething();
        }

    }
    public void add(DoSomething composite) {
        elementList.add(composite);
    }

    public void remove(DoSomething composite) {
        elementList.remove(composite);
    }

    public List<DoSomething> getElementList() {
        return elementList;
    }

    public void setElementList(List<DoSomething> elementList) {
        this.elementList = elementList;
    }

}
