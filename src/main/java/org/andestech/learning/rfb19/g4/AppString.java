package org.andestech.learning.rfb19.g4;

public class AppString {

    public static void  main(String[] args)
    {

        String s1 ="Hello!";
        String s2 = new String("Hello!");

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1==s2); // так нельзя сравнивать строки!!!

        //1
        System.out.println(s1.equals(s2));

        //2
        System.out.println(s1.compareTo(s2));




    }
}
