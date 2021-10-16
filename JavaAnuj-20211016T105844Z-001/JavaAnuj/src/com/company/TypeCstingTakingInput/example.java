package com.company.TypeCstingTakingInput;

public class example {
    public static void main(String[] args) {
        byte x = 10;
        int y = x;
        System.out.println(y);//no error automatic type casting


        double a=20.9050;
        int b=(int)a;//narrowing flor value asigned
        System.out.println(b+a);
        System.out.println(b);
    }



}
