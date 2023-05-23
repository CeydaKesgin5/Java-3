package kodlamaio.Business;

import kodlamaio.Core.logging.Logger;
import kodlamaio.Entities.Instructor;
import kodlamaio.dataAccess.HibernateInstructorDao;
import kodlamaio.dataAccess.InstructorDao;

import java.util.ArrayList;

public class InstructorManager {
    ArrayList<Instructor> instructors=new ArrayList<>();
    InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao,ArrayList<Instructor> instructors,Logger[] loggers) {
        this.instructorDao=instructorDao;
        this.instructors = instructors;
        this.loggers=loggers;
    }



    public void add(Instructor instructor){
        instructors.add(instructor);
        instructorDao.addInstructor(instructor);

        for(Logger logger:loggers){
            logger.log(instructor.getName());
        }
    }


}
