package com.company.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args)
    {
        List<String> l =new java.util.ArrayList<>();
        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();
        l.add("Shiwani");
        arr.add(1);
        arr.add(3);
        s.add("Kumari");
        s.add("gjgkgk");

        //to update any index
        s.set(0,"asd");
        s.set(1,"ryug");
        System.out.println(arr);
        System.out.println(l);

        //adding one list to other
        l.addAll(s);
        System.out.println(l);

        //implementing generics
        Pair<String, Boolean> p = new Pair<String, Boolean>("Shivam",true);
        p.getDescription();

        //TO ARRAY is for returning array
         String temp[] = new String[l.size()];
         l.toArray(temp);
         for(String e:temp)
             System.out.println(e);
    }
}
