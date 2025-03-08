package com.Spring.LearnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ALien {
    @Autowired
    Laptop laptop;
    public void code(){
        laptop.printLaptop();
        System.out.println("Coding");
    }
}
