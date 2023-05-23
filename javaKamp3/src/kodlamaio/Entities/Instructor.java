package kodlamaio.Entities;

import kodlamaio.Core.logging.Logger;
import kodlamaio.dataAccess.HibernateInstructorDao;

public class Instructor {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
