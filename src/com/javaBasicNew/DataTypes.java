package com.javaBasicNew;

public class DataTypes {
    public static void main(String[] args) {
        /** Primitive data types */
        byte age = 32; // stores whole numbers from -128 to 127
        int dob = 1989; // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        double heightValue = 5.4; // Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean isMarried = true; // Stores true or false values
        long salary = 10293847483920183L; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float floatingValue = 34.3452356e33F; // 6 to 7 digit
        char myChar = 'P'; // storing single character with single quote
        short myShortNum = 5000; // store whole numbers from -32768 to 32767

        System.out.println("############ primitive data type ###############");
        System.out.println(age);
        System.out.println(dob);
        System.out.println(heightValue);
        System.out.println(isMarried);
        System.out.println(salary);
        System.out.println(floatingValue);
        System.out.println(myChar);
        System.out.println(myShortNum);
    }
}
