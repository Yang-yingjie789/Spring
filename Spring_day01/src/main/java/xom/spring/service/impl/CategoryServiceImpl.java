package xom.spring.service.impl;

import xom.spring.dao.CategoryDao;
import xom.spring.dao.impl.CategoryDaoImpl;
import xom.spring.factory.Beanfactory;
import xom.spring.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao categoryDao= (CategoryDao) new Beanfactory().getBean("categoryDao");
    public void saveCategory() {
         categoryDao.saveCategory();
    }
}
