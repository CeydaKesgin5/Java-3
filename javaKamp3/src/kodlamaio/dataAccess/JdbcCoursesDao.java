package kodlamaio.dataAccess;

import kodlamaio.Entities.Course;

public class JdbcCoursesDao implements CourseDao{
    public void addCourse(Course course){
        System.out.println("Kurs Jdbc ile veritabanına eklendi");
    }
}
