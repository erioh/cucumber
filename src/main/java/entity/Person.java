package entity;
import java.util.*;

public class Person {
    private Map<Person, Integer> distanceToMap = new HashMap<>();
    private List<String> heardedMessageList = new ArrayList<>();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int getDistanceTo(Person person) {
        return distanceToMap.get(person);
    }

    public void setDistanceTo(int distance, Person person) {
        this.distanceToMap.put(person, distance);
        person.distanceToMap.put(this, distance);
    }

    public void shout(String message) {
        System.out.println(message);
    }

    public List<String> getMessageHeard() {
        return heardedMessageList;
    }

    public void addHeardedMessageList(String heardedMessageList) {
        this.heardedMessageList.add(heardedMessageList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}