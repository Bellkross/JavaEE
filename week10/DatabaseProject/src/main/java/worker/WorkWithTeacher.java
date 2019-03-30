package worker;

import data.dao.TeachersDao;
import data.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class WorkWithTeacher {
    @Autowired
    private TeachersDao teachersDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public Teacher addTeacher(final Teacher teacher) {
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher has been added " + teacher);
        return teacher;
    }

    public Teacher getTeacherById(int id) {
        return teachersDao.getTeacherById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public void saveTeacher(Teacher teacher) {
        teachersDao.saveTeacher(teacher);
        System.out.println("Teacher has been saved " + teacher);
    }
}
