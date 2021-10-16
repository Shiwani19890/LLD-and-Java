package com.company.StringUseage;

public class StringExample {
    public static void main (String[] args){
        // 1st way of intializing the string
        String name= "Shiwani";
        String name2="Shiwani";


        // 2nd way of initializing the string
        String anotherName = new String("Shiwani");

        System.out.println(anotherName==name);//giving result as false;
        // name value is assigned from the pool area;
        // whereas anotherName is assigned from heap;

        System.out.println(name==name2);
        //cout that true because Shiwani value is being assigned
        // to both name and name1 from the pool area

        System.out.println(name.charAt(0));
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));
        System.out.println(name.contains("a"));

        System.out.println(name.equals(name2));
        // check whether the value is same in both variable

        System.out.println(name.isEmpty());

        System.out.println(name.replace('a','b'));

        String str="sdos,hovosdf,ivboa,hvpisdpf";
        String allele[]= str.split(",");
        for(String i:allele)
            System.out.println(i);

        System.out.println(name.indexOf('a'));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        name="    Sgglhl   ";
        System.out.println(name.trim());
    }
}
