package com.company.Inheritance;

public class Teacher extends Person {

    public Teacher(String name)
    {
        super(name);//parent ka constructer call hoga

    }
    public void teach()
    {
        System.out.println(name+"teacher is teaching");
    }
    public void eat(){
        super.eat();//parent class definition will be called
        System.out.println("teacher"+ name+ "is eating");
    }// this is overridding ,overridding the function eat of parent
    // same signature should be there


    public static void laughing()
    {

        System.out.println("teacher is laughing");
    }

}
