package xom.spring.web;

import xom.spring.service.CategoryService;
import xom.spring.service.impl.CategoryServiceImpl;

public class ClientDemo1 {
    private static CategoryService  categoryService=new CategoryServiceImpl();
    public static void main(String[] args) {
       categoryService.saveCategory();
    }
}
