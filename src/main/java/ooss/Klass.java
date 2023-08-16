package ooss;

public class Klass {

    private final int number;
    private Student leader;

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
        if (this.equals(student.getKlass())) this.leader = student;
        else System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return leader.equals(student);
    }
}
