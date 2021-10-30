package com.javaBasicNew;
import java.util.Scanner;

/**
 * Program takes input as your name and last name then it prints your full name simple :)
 * - Usage of Scanner class
 * - Taking inputs from Scanner class instance
 * - Taking firstname and last name
 * - printing full name as output
 * */
public class TakingInput_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String firstName = sc.next();

        System.out.println("Enter your last name");
        String lastName = sc.next();

        System.out.println(firstName + " " + lastName);
    }
}
