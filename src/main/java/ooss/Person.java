package ooss;

public class Person {

    private final int id;
    private final String name;
    private final int age;
    private String occupation;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        StringBuilder introduction = new StringBuilder();
        introduction.append(String.format("My name is %s. I am %d years old.", name, age));
        if (occupation != null) introduction.append(String.format(" I am a %s.", occupation));
        return introduction.toString();
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
