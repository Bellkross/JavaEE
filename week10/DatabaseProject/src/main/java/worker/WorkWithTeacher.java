package worker;

import data.dao.TeachersDao;
import data.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Transactional
public class WorkWithTeacher {
    @Autowired
    private TeachersDao teachersDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public Teacher addTeacher(final Teacher teacher) {
        transactionTemplate.execute(new TransactionCallback<Void>() {
                                        public Void doInTransaction(final TransactionStatus transactionStatus) {
                                            try {
                                                teachersDao.addTeacher(teacher);
                                                System.out.println("Teacher has been added " + teacher);
                                            } catch (RuntimeException e) {
                                                transactionStatus.setRollbackOnly();
                                                throw e;
                                            }
                                            return null;
                                        }
                                    }
        );
        return teacher;
    }

    public Teacher getTeacherById(int id) {
        return teachersDao.getTeacherById(id);
    }

    public void saveTeacher(Teacher teacher) {
        teachersDao.saveTeacher(teacher);
        System.out.println("Teacher has been saved " + teacher);
    }
}
