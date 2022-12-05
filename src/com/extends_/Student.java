package com.extends_;

public class Student {
    public String name;
    public int age;

    public Student(){
        System.out.println("父类的构造器被调用");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(this.name + "很厉害");
    }
}
