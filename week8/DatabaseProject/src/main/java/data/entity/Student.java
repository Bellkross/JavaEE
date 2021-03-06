package data.entity;

public class Student {
    private int id;
    private String pib;
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
