package com.extends_;

public class Graduate extends Student {
    String name;
    public Graduate(){
        System.out.println("Graduate构造器被调用");
    }
    public Graduate(String name) {
        System.out.println("Graduate的Sting name构造器被调用");
    }
    public void GraduateF(){
        System.out.println("Graduate方法" + name);
    }
}
