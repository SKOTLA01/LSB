package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private  Laptop lap;
    @ConstructorProperties("age")
    public Alien(int age){

        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien(){
        System.out.println("Object created");
    }
    public  void coding(){
        System.out.println("Coding");
        lap.compile();;
    }

}
