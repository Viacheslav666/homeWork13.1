import java.util.Objects;

public class Book {
    String name;
    Athor athor;
    int age;



    public  Book(String name, Athor athor, int age) {
        this.name = name;
        this.athor = athor;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public Athor getAthor() {
        return athor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", athor=" + athor +
                ", age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && name.equals(book.name) && athor.equals(book.athor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, athor, age);
    }
}
