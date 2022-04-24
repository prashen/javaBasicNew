package com.javaBasicNew;

public class String_04 {
    public static void main(String[] args) {
        /**
         * We can declare strings two ways:
         * */

        // String literal
        String myName = "Prashen Jeet Roy";
        System.out.println(myName);

        // Using new
        String myCompanyName = new String("Alumnus Software");
        System.out.println(myCompanyName);

        // concatenate
        String name1 = "Prashen";
        String name2 = "Roy";

        String name3 = name1 + " " + name2;
        System.out.println(name3);

        // charAt
        String name4 = "Prashen";
        System.out.println(name4.charAt(0));

        // length
        String name5 = "Prashen";
        System.out.println(name4.length());

        // replace
        String name6 = "Prashen";
        String result6 = name6.replace('P', 'C');
        System.out.println(result6); // string is updated
        System.out.println(name6); // string is immutable so the main variable will not change

        // substring
        String name7 = "Prashen";
        String result7 = name7.substring(0, 4);
        System.out.println(result7);





    }
}
