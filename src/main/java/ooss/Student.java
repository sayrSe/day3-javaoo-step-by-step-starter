package ooss;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
        super.setOccupation("student");
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        StringBuilder introduction = new StringBuilder();
        introduction.append(super.introduce());
        if (klass != null) {
            if (klass.isLeader(this))
                introduction.append(String.format(" I am the leader of class %s.", klass.hashCode()));
            else
                introduction.append(String.format(" I am in class %s.", klass.hashCode()));
        }

        return introduction.toString();
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return klass.equals(this.klass);
    }
}
