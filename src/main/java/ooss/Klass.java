package ooss;

import java.util.stream.Collectors;

public class Klass {

    private final int number;
    private Student leader;
    private Teacher teacher;

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
            displayTeacherKnowsLeader();
        } else System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return leader.equals(student);
    }

    public void attach(Teacher teacher) {
        this.teacher = teacher;
    }

    private void displayTeacherKnowsLeader() {
        String teacherName = teacher.getName();
        String classNumbers = teacher.getKlasses().stream()
                .map(klass -> String.valueOf(klass.hashCode()))
                .collect(Collectors.joining(", "));
        String klassLeader = this.leader.getName();
        System.out.printf("I am %s, teacher of Class %s. I know %s become Leader.%n", teacherName, classNumbers, klassLeader);
    }
}
