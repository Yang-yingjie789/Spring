package xom.spring.web;

import xom.spring.factory.Beanfactory;
import xom.spring.service.CategoryService;

public class ClientDemo1 {
    //private static CategoryService  categoryService= (CategoryService) new Beanfactory().getBean("categoryService");
    public static void main(String[] args) {

            CategoryService categoryService = (CategoryService) Beanfactory.getBean("categoryService");
            System.out.println(categoryService);
            categoryService.saveCategory();


    }
}
