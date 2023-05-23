package kodlamaio.dataAccess;

import kodlamaio.Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    public void addInstructor(Instructor instructor){
        System.out.println("Eğitmen Jdbc ile veritabanına eklendi");
    }
}
