package data.entity;

import javax.persistence.*;

@Entity
@Table(name="STUDENTS")
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="pib")
    private String pib;

    @Column(name="course")
    private int course;

    public Student() {
    }


    public Student(final String pib, final int course) {
        this.pib = pib;
        this.course = course;
    }

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
}
