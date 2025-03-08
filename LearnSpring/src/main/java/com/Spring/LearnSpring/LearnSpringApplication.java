package com.Spring.LearnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(LearnSpringApplication.class, args); // it give container
		System.out.println("Hello World");
		ALien aLien=context.getBean(ALien.class);
ALien obj1=context.getBean(ALien.class);
Laptop laptop=context.getBean(Laptop.class);
laptop.printLaptop();
		aLien.code();
		obj1.code();;

	}

}
