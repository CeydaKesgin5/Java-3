package kodlamaio.Business;

import kodlamaio.Core.logging.Logger;
import kodlamaio.Entities.Category;
import kodlamaio.Entities.Course;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.dataAccess.HibernateCategoryDao;

import java.util.ArrayList;

public class CategoryManager {
    private ArrayList<Category> categories;
    private Logger[] loggers;
    CategoryDao categoryDao;
    HibernateCategoryDao hibernateCategoryDao;
    public CategoryManager(CategoryDao categoryDao,ArrayList<Category> categories,Logger[] loggers) {
        this.categoryDao = categoryDao;

        this.categories = categories;
        this.loggers=loggers;
    }



    public void addCategory(Category category) throws Exception{
        for (Category category1: categories) {

            if (category.getName() == category1.getName()) {
                throw new Exception("Kategori adı tekrar edemez.");
            }
        }
            categories.add(category);
            categoryDao.addCategory(category);

            for(Logger logger:loggers){
                logger.log(category.getName());
            }
        }
}



