package data.dao;

import data.entity.Teacher;
import org.springframework.transaction.annotation.Transactional;

public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
