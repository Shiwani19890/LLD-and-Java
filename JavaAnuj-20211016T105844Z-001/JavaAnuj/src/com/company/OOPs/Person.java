package com.company.OOPs;

public class Person {

        int age;
        String name;
        static String breed;
        static class funt{

        }
        public static void fun2()
        {
            breed="fffdk";//static funstion can only handle static variables;

        }
   public static void main(String[] args)
   {
       Person p = new Person();
       p.age=8;
       Person p2=new Person();
       p2.age=9;
       Person.breed="hom";
       Person.fun2();// way to handle static field;

       System.out.println(p2.age+" "+Person.breed);
   }


}
