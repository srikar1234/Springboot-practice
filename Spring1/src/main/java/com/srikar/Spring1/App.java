package com.srikar.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//This is the container which takes configurations from the xml file in the resources folder. Folder placement is really important.
    	//Objects are created at the line below based on how many beans are defined in the XML file
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//We created a bean with id as Alien and point it to the class Alien. We get a reference to the obj from the bean
    	//Obj1 and Obj2 are both referencing the same object if scope is singleton
//    	Alien obj1 = (Alien) context.getBean("alien1");
//    	obj1.age = 21;
//    	System.out.println(obj1.age);
//    	obj1.code();
//    	
//    	Alien obj2 = (Alien) context.getBean("alien1");
//    	System.out.println(obj2.age);
//    	obj2.code();
//    	
//        System.out.println( "Hello World!" );
    	Alien obj1 = (Alien) context.getBean("alien1");
    	obj1.setAge(21);
    	System.out.println(obj1.getAge());
    	obj1.code();
    	
		/*
		 * Alien obj2 = (Alien) context.getBean("alien2");
		 * System.out.println(obj2.getAge()); obj2.code();
		 */
    	
		/*
		 * Desktop obj = context.getBean("comp2", Desktop.class);
		 * System.out.println(obj);
		 */
    	
    	
    }
}
