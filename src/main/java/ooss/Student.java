package ooss;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
        super.setOccupation("student");
    }

    public String introduce() {
        StringBuilder introduction = new StringBuilder();
        introduction.append(super.introduce());
        if (klass != null) introduction.append(String.format(" I am in class %s.", klass.getKlassNumber()));

        return introduction.toString();
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return klass.equals(this.klass);
    }
}
