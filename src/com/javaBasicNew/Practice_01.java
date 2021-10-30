package com.javaBasicNew;
import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        Scanner subjects = new Scanner(System.in);

        /** subject 1 -  math */
        System.out.println("Enter marks of math:");
        float subject1 = subjects.nextFloat();

        if(subject1 >= 100 ){
            System.out.println("correct!");
        } else{
            subjects.nextLine();
        }


        /** subject 2 -  eng */
        System.out.println("Enter marks of eng:");
        float subject2 = subjects.nextFloat();

        /** subject 3 -  hindi */
        System.out.println("Enter marks of hindi:");
        float subject3 = subjects.nextFloat();

        /** subject 4 -  science */
        System.out.println("Enter marks of science:");
        float subject4 = subjects.nextFloat();

        /** subject 5 -  commerce */
        System.out.println("Enter marks of commerce:");
        float subject5 = subjects.nextFloat();

        /** result */

        float totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float fromTotalMarks = 500;
        float percentage =  totalMarks/fromTotalMarks * 100;

        System.out.println("The Percentage of the marks will be: ");
        System.out.println(percentage + "%");


    }
}
