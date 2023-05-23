package kodlamaio.dataAccess;

import kodlamaio.Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    public void addInstructor(Instructor instructor){
        System.out.println("Eğitmen Hibernate ile veritabanına eklendi");
    }
}
