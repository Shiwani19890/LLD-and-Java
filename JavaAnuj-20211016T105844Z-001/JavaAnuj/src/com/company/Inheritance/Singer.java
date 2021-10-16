package com.company.Inheritance;

public class Singer extends Person{

    public Singer(String name) {
        super(name);
    }

    public void sing()
    {
        System.out.println("Singer is singing");
    }

    public static void laughing()
    {
        System.out.println("singer is laughing");
    }
}
