package kodlamaio.dataAccess;

import kodlamaio.Entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    public void addCategory(Category categories){
        System.out.println("Kategori Hibernate ile veritabanına eklendi");
    }

}
