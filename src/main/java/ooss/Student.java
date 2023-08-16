package ooss;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
        super.setOccupation("student");
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return klass.equals(this.klass);
    }
}
