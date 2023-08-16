package ooss;

public class Klass {

    private final int id;
    private Student leader;

    public Klass(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return id == klass.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }

    public boolean isLeader(Student student) {
        return leader.equals(student);
    }
}
