package data.dao;

import data.entity.Student;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}
