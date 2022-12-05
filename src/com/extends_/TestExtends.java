package com.extends_;


//继承
public class TestExtends {
    public static void main(String[] args) {
        Graduate graduate01 = new Graduate();
        System.out.println("================");
        Graduate graduate = new Graduate("和");
        graduate.name = "Tom";
        graduate.GraduateF();
        graduate.show();
        System.out.println("================");
        Pupil pupil = new Pupil();
        pupil.name = "JJ";
        pupil.PupilF();
        pupil.show();
    }
}
