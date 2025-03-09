package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
   Alien alien= (Alien) context.getBean(Alien.class);
       alien.coding();
        System.out.println(alien.getAge());
    }
}