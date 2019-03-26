package practice5JPA.data;

import com.googlecode.ehcache.annotations.Cacheable;

import java.util.List;

public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    List<Lecture> getAllLectures();

    void saveLecture(Lecture lecture);

}
