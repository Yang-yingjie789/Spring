package xom.spring.service.impl;

import xom.spring.dao.CategoryDao;
import xom.spring.factory.Beanfactory;
import xom.spring.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    //CategoryDao categoryDao= (CategoryDao) Beanfactory.getBean("categoryDao");
     private int i=1;
    public void saveCategory() {

        CategoryDao categoryDao= (CategoryDao) Beanfactory.getBean("categoryDao");

        System.out.println("categoryDao ："+categoryDao);
        categoryDao.saveCategory();
        System.out.println(i);
        i++;
    }
}
