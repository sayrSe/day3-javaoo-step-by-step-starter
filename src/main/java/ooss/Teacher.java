package ooss;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        super.setOccupation("teacher");
    }

    public void assignTo(Klass klass) {
        this.klass = klass;
    }

    public boolean belongsTo(Klass klass) {
        return klass.equals(this.klass);
    }
}
