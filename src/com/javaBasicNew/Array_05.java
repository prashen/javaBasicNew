package com.javaBasicNew;
import java.util.Arrays;

public class Array_05 {
    public static void main(String[] args) {
        // string array
        String[] myStringArray = new String[3];

        myStringArray[0] = "Prashen";
        myStringArray[1] = "Shyam";
        myStringArray[2] = "Ram";

//        System.out.println(myStringArray[2]);

        // int array
        int[] intArray = new int[3];

        intArray[0] = 20;
        intArray[1] = 50;
        intArray[2] = 10;

        // array short
        System.out.println(intArray[0]);
        Arrays.sort(intArray);
        System.out.println(intArray[0]);

        // if we know the value of array
        int[] weKnowTheValueOfArray = {20, 50, 10};

        // two dimensional array
        int[][] twoDArrays = {{20, 50, 10}, {20, 50, 10}};

        System.out.println(twoDArrays[0][0]);
        System.out.println(twoDArrays[1][1]);









    }
}
