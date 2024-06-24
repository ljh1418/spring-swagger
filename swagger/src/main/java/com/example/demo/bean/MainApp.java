//package com.example.demo.bean;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.example.demo.controller.UserController;
//
//public class MainApp {
//	public static void main(String[] args) {
//		
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
//        HelloWorld obj2 = (HelloWorld) context.getBean("beanTest");
//        
////        
//        UserController userController = context.getBean(UserController.class);
//        
//        obj1.getMessage();
//        obj2.getMessage();
//		
//        userController.controllerBeanMessage();
//	}
//}
