package kodlamaio.dataAccess;

import kodlamaio.Entities.Course;

public class HibernateCourseDao implements CourseDao{
    public void addCourse(Course course){
        System.out.println("Kurs Hibernate ile veritabanına eklendi");
    }
}
