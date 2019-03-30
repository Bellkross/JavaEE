import data.entity.Student;
import data.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import worker.WorkWithStudents;
import worker.WorkWithTeacher;

import java.util.Date;

public class App{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");
        //new WorkWithStudents();
        Student testStudent = new Student("Vlad Valt", 1);
        worker.saveStudentToDb(testStudent);
        WorkWithTeacher workWithTeacher = (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTeacher(teacher);

    }
}
