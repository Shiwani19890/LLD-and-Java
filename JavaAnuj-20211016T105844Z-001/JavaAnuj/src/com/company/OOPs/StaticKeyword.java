package com.company.OOPs;


/**
 * Execution starts from the main method which has string array
 *for every class when we create new object new copy of object is created
 * new memory is allocated each time.
 *
 * But static keyword is related with CLASS
 * does not belong to object ,helps in memory managemeny
 *
 *Ex; if person is classe
 * and breed is field
 * the breed will be static as all person will be homosapien
 *
 *
 * We cannot declare top level class as static only nested class
 * can be declared static
 *
 * top static block runs first then next then next
 *
 * variables inside function can't be static
 */
public class StaticKeyword {

    static {
        System.out.println("in block1");
    }
    static {
        System.out.println("in block 2");
    }
    public static void fun(){

    }
    public static void main(String[] args){
        System.out.println("inside main");
    }
}
