package xom.spring.service.impl;

import xom.spring.dao.CategoryDao;
import xom.spring.factory.Beanfactory;
import xom.spring.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    //CategoryDao categoryDao= (CategoryDao) Beanfactory.getBean("categoryDao");
    private CategoryDao categoryDao= (CategoryDao) Beanfactory.getBean("categoryDao");
    public void saveCategory() {
        int i=1;
        System.out.println("categoryDao ："+categoryDao);
        categoryDao.saveCategory();
        System.out.println(i);
        i++;
    }
}
