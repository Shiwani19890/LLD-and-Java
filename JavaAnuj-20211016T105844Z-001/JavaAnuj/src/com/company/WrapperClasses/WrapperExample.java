package com.company.WrapperClasses;

/**
 Java allows us to include primitive data type in the family
 of objects by using what are called wrapper classes.

 boolean -> Boolean
 byte    -> Byte
 char    -> Character
 short   -> Short
 int     -> Integer
 long    -> Long
 float   -> Float
 double  -> Double

 useFul methods of wrapper Classes
 valueOf()
 static method
 return Object reference of relative wrapper class

parseXxx()
static method
 it return Xxx value


 xxxValue()
 instance method of wrapper class
 xxx can be replaced by any primitive type
 Returns corresponding primitive type
 */




public class WrapperExample {
    public static void main(String[] args)
    {
        Integer int1= Integer.valueOf("123");// int1 has object reference
        Double d1= Double.valueOf(34); // d1 also has object refernce

        Integer int2 = Integer.valueOf("101010",2);

        int int3= Integer.parseInt("1233");
        double d2=Double.parseDouble("3.24");

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(d1);
        System.out.println(d2);

        int c= int2.intValue();
    }

}
