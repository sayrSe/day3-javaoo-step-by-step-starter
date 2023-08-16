package ooss;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private final List<Klass> klasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        super.setOccupation("teacher");
    }

    public void assignTo(Klass klass) {
        klasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return klasses.stream().anyMatch(klass::equals);
    }
}
