import java.util.Objects;

public class Athor {
    String name;
    String lastName;

    public Athor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Фамилия автора: " + getLastName() + "  Имя автора: " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athor athor = (Athor) o;
        return name.equals(athor.name) && lastName.equals(athor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
