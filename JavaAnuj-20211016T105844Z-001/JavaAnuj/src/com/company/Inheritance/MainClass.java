package com.company.Inheritance;

public class MainClass {
    public static void main(String[] args){
        Teacher t= new Teacher("Mr. Harry");
        //
        //name is proctected so the protected keyword gets
        //passed on to child
        //if any other class which does not extend parent
        //then protected variables will not be visible to those


        t.eat();
        t.walk();
        t.teach();

        Teacher t1= new Teacher("sita");

        boolean y = t1 instanceof Teacher;//this tell if t1 is an instance of teacher or not
        // this tell if an object is an instance of that class or not
        System.out.println(t1 instanceof Person);
    }
}
