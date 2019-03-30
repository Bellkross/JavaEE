package worker;

import data.dao.StudentsDao;
import data.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class WorkWithStudents {

    @Autowired
    private StudentsDao studentsDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public void saveStudentToDb(final Student student) {
        transactionTemplate.execute(new TransactionCallback<Void>() {
                                        public Void doInTransaction(final TransactionStatus transactionStatus) {
                                            try {
                                                if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
                                                    studentsDao.addStudent(student);
                                                    System.out.println("Student have been saved "+student);
                                                }
                                            } catch (RuntimeException e) {
                                                transactionStatus.setRollbackOnly();
                                                throw e;
                                            }
                                            return null;
                                        }
                                    }
        );
    }
}

