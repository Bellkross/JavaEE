package data.dao;

import data.entity.Student;
import org.springframework.transaction.annotation.Transactional;

public interface StudentsDao {
    @Transactional
    void addStudent(Student student);
    @Transactional
    Student getStudentById(int id);
}
