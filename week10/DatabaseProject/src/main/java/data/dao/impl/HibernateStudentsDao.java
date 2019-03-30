package data.dao.impl;

import data.dao.StudentsDao;
import data.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class HibernateStudentsDao implements StudentsDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addStudent(final Student student) {
        currentSession().save(student);
    }

    public Student getStudentById(final int id) {
        return (Student) currentSession().get(Student.class, id);
    }
}
