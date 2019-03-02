import data.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import worker.WorkWithStudents;

public class App{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");
        //new WorkWithStudents();
        Student testStudent = new Student("Vlad Valt", 1);
        worker.saveStudentToDb(testStudent);
    }
}
