package practice5JPA.data;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String pib;
    private int course;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(final String pib) {
        this.pib = pib;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(final int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", pib='" + pib + '\'' +
                ", course=" + course +
                '}';
    }
}
