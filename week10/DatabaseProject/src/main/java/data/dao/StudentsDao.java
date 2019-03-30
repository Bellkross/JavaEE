package data.dao;

import data.entity.Student;
import org.springframework.transaction.annotation.Transactional;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}
