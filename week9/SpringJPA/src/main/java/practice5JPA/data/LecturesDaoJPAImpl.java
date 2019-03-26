package practice5JPA.data;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class LecturesDaoJPAImpl implements LecturesDao{
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    @Cacheable("lecturesCache")
    public List<Lecture> getAllLectures() {
        return em.createNamedQuery("selectAllLectures", Lecture.class).getResultList();
    }

    @Cacheable("lecturesCache")
    public Lecture getLecture(int id) {
        Query query1 = em.createQuery(
                "select l from Lecture l " +
                        "where l.id=" + id, Lecture.class);

        return (Lecture) query1.getSingleResult();
    }

    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }
}
