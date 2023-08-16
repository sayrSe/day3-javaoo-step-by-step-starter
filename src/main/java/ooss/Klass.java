package ooss;

public class Klass {

    private final int id;

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
}
