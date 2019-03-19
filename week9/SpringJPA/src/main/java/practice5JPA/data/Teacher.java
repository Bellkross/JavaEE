package practice5JPA.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="teachers")
public class Teacher {

    @Id
    @GeneratedValue
    @Column(name = "teacherId")
    private int id;
    @Column(name="birth_date")
    private Date birthDate;
    @Column(name="cell_phone")
    private String cellPhone;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(final String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                ", cellPhone='" + cellPhone + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
