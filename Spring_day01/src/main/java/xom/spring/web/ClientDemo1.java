package xom.spring.web;

import xom.spring.factory.Beanfactory;
import xom.spring.service.CategoryService;
import xom.spring.service.impl.CategoryServiceImpl;

public class ClientDemo1 {
    private static CategoryService  categoryService= (CategoryService) new Beanfactory().getBean("categoryService");
    public static void main(String[] args) {
       categoryService.saveCategory();
    }
}
