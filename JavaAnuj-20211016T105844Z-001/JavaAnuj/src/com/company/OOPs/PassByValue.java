package com.company.OOPs;


/**
  Java is always pass by value see example below
  when classes objects are passed in function then the value that
 is being passed is the reference of the object
 */


public class PassByValue {
     public static void main(String[] args) {
//        int c=34;
//        int d=12;
//
//        swap(c,d);
//         System.out.println(c +"+"+ d);

         Dog c = new Dog();
         c.legs=4;
         Dog d = new Dog();
         d.legs=3;
         swap(c,d);
         System.out.println(c.legs+ "+" +d.legs);
    }

    private static void swap(int c, int d) {
         int temp=c;
          c=d;
          d=temp;
        System.out.println(c+ "+"+d);
    }
    private static void swap(Dog a,Dog b)
    {
        Dog temp=a;
        a=b;
        b=temp;

    }
}
class Dog{
    int legs;
}