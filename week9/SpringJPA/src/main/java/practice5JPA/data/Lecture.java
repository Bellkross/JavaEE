package practice5JPA.data;

import org.springframework.cache.annotation.Cacheable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NamedQuery(name = "selectAllLectures",
        query = "select l from Lecture l"
)
@Table(name = "lectures")
@Cacheable("lecturesCache")
public class Lecture implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String name;
    private double credits;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(final double credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return id == lecture.id &&
                Double.compare(lecture.credits, credits) == 0 &&
                Objects.equals(name, lecture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, credits);
    }
}
