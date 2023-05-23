package kodlamaio.Business;

import kodlamaio.Core.logging.Logger;
import kodlamaio.Entities.Course;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.dataAccess.HibernateCourseDao;

import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Course> courses;
    private Logger[] loggers;
    CourseDao courseDao;
    HibernateCourseDao hibernateCourseDao;
    public CourseManager(CourseDao courseDao,ArrayList<Course> courses,Logger[] loggers) {
        this.courseDao = courseDao;

        this.courses = courses;
        this.loggers=loggers;
    }



    public void addCourse(Course course) throws Exception{
        for (Course courses1: courses) {

            if (course.getCourseName() == courses1.getCourseName()) {
                throw new Exception("Kategori adı tekrar edemez.");
            }

        }
        if(course.getPrice()<0)
            throw new Exception("kurs fiyatı 0dan küçük olamaz.");

        courses.add(course);
        courseDao.addCourse(course);

        for(Logger logger:loggers){
            logger.log(course.getCourseName());
        }
    }
}
