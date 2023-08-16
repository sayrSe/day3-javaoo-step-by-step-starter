package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private final List<Klass> klasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        super.setOccupation("teacher");
    }

    public String introduce() {
        StringBuilder introduction = new StringBuilder();
        introduction.append(super.introduce());
        if (!klasses.isEmpty()) {
            introduction.append(" I teach Class ")
                    .append(klasses.stream()
                            .map(klass -> String.valueOf(klass.hashCode()))
                            .collect(Collectors.joining(", "))).append(".");
        }

        return introduction.toString();
    }

    public void assignTo(Klass klass) {
        klasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return klasses.stream().anyMatch(klass::equals);
    }

    public boolean isTeaching(Student student) {
        return klasses.stream().map(Klass::hashCode).collect(Collectors.toList())
                .contains(student.getKlass().hashCode());
    }
}
