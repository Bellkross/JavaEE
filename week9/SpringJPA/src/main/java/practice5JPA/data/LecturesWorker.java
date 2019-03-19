package practice5JPA.data;

import org.springframework.beans.factory.annotation.Autowired;

public class LecturesWorker {

    private LecturesDao lecturesDao;

    @Autowired
    public LecturesWorker(final LecturesDao lecturesDao) {
        this.lecturesDao = lecturesDao;
    }

    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        return lecture;
    }
}

