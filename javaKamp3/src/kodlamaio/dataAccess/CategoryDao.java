package kodlamaio.dataAccess;

import kodlamaio.Entities.Category;

public interface CategoryDao {
    void addCategory(Category category);
    /*default void addCategory(Category category){

        System.out.println("Kategori eklendi"+category.getName());
    }*/

}
