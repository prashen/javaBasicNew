package com.javaBasicNew;

public class Operators_08 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
//        int add = a + b;
//        int minus = a - b;
//        int mul = a * b;
//        int div = a / b;
//        int modulo = a % b;

        int num = 1;
        //num++;
        //++num;
        //--num;
        //

        System.out.println(++num);
        System.out.println(num);

        // comparison operators
        // a==b;
        // a!=b;
        // a > b;
        // a < b;
        // a <= b;
        // a >= b;

        // conditional statement
        boolean isSun = true;

        if(isSun){
            System.out.println("Sun is out");
        } else {
            System.out.println("Sun is down");
        }

        // logical operators
        // &&
        // ||

        // switch
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Sunday");

        }

    }
}
