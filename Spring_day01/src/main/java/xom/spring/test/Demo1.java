package xom.spring.test;

import xom.spring.domain.HelloWorld;

public class Demo1 {
    public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorld();
        helloWorld.setName("Japan");
        helloWorld.hello();
    }
    public void test(){
        System.out.println("Hello git project");
    }
}
