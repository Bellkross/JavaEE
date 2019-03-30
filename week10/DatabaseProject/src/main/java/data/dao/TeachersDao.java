package data.dao;

import data.entity.Teacher;
import org.springframework.transaction.annotation.Transactional;

public interface TeachersDao {
    @Transactional
    void addTeacher(Teacher teacher);
    @Transactional
    Teacher getTeacherById(int id);
    @Transactional
    void saveTeacher(Teacher teacher);
}
