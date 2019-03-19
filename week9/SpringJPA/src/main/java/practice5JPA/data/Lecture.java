package practice5JPA.data;

import javax.persistence.*;

@Entity
@Table(name="lectures")
public class Lecture {

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
}
