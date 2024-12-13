package Human1;

import java.time.LocalDate;
import java.util.Objects;

public class Human {
    String name;
    LocalDate dateOfBirth;
    int age;

    public Human(String name, int age, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(dateOfBirth, human.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, age);
    }
}
