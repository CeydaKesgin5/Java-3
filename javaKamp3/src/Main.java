import kodlamaio.Business.CategoryManager;
import kodlamaio.Business.CourseManager;
import kodlamaio.Core.logging.DatabaseLogger;
import kodlamaio.Core.logging.FileLogger;
import kodlamaio.Core.logging.Logger;
import kodlamaio.Entities.Category;
import kodlamaio.Entities.Course;
import kodlamaio.Entities.Instructor;
import kodlamaio.dataAccess.HibernateCategoryDao;
import kodlamaio.Business.InstructorManager;
import kodlamaio.dataAccess.HibernateCourseDao;
import kodlamaio.dataAccess.HibernateInstructorDao;

import java.util.ArrayList;

public class Main {
    public static <CoursesManager> void main(String[] args) throws Exception {

        Logger[] loggers= {new DatabaseLogger(), new FileLogger()};
 

        Category category1= new Category();
        category1.setName("Yazılım");


        Category category2= new Category();
        category2.setName("Donanım");


        ArrayList<Category> categoryList = new ArrayList<>();
        CategoryManager categoryManager =  new CategoryManager(new HibernateCategoryDao() ,categoryList, loggers);
        categoryManager.addCategory(category1);
        categoryManager.addCategory(category2);


        System.out.println("--------------------------------------------------");
        Course course1=new Course();
        course1.setCourseName("Java");
        course1.setPrice(90);

        Course course2=new Course();
        course2.setCourseName("C#");
        course2.setPrice(1);

        ArrayList<Course> courses= new ArrayList<>();
        CourseManager coursesManager=new CourseManager(new HibernateCourseDao(),courses,loggers);
        coursesManager.addCourse(course1);
        coursesManager.addCourse(course2);


        System.out.println("--------------------------------------------------");

        Instructor instructor1 =new Instructor();
        instructor1.setName("Engin Demiroğ");
        ArrayList<Instructor> instructors=new ArrayList<>();


        InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(),instructors,loggers);
        instructorManager.add(instructor1);



    }
}