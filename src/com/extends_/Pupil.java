package com.extends_;

public class Pupil extends Student{
    public Pupil(){
        super(); 
        System.out.println("Pupil构造器被调用");
    }
    public void PupilF(){
        System.out.println("PupilF方法" + name);
    }
}
