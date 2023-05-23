package kodlamaio.dataAccess;

import kodlamaio.Entities.Category;
import kodlamaio.Entities.Course;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void addCategory(Category category) {
        System.out.println("Kategori Jdbc ile veritabanına eklendi");
    }
}
