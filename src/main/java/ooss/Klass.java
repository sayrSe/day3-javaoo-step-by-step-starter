package ooss;

import java.util.stream.Collectors;

public class Klass {

    private final int number;
    private Student leader;
    private Teacher teacher;
    private Student student;

    public Klass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public void assignLeader(Student student) {
        if (this.equals(student.getKlass())) {
            this.leader = student;
            if (this.teacher != null || this.student != null) displayPersonKnowsLeader();
        } else System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return leader.equals(student);
    }

    public void attach(Student student) {
        this.student = student;
    }

    public void attach(Teacher teacher) {
        this.teacher = teacher;
    }

    private String getName() {
        return this.student != null ? this.student.getName() : this.teacher.getName();
    }

    private String getOccupation() {
        return this.student != null ? this.student.getOccupation() : this.teacher.getOccupation();
    }

    private String getKlassNumbers(String occupation) {
        return "student".equals(occupation) ?
                String.valueOf(student.getKlass().hashCode()) :
                teacher.getKlasses().stream()
                        .map(klass -> String.valueOf(klass.hashCode()))
                        .collect(Collectors.joining(", "));
    }

    private void displayPersonKnowsLeader() {
        String name = getName();
        String occupation = getOccupation();
        String klassLeader = this.leader.getName();
        String messageFormat = "I am %s, %s of Class %s. I know %s become Leader.";

        System.out.printf(messageFormat, name, occupation, getKlassNumbers(occupation), klassLeader);
    }
}
