package com.java.data;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(sum(10,4));
        System.out.println(subtract(4,5));
        System.out.println(multiplication(2,6));
        System.out.println(division(6,4));
    }


    public static float sum (float num1, float num2){
        return num1+num2;
    }

    public static float subtract (float num1, float num2){
        return num1+num2;
    }

    public static float multiplication (float num1, float num2){
        return num1*num2;
    }

    public static float division (float num1, float num2){
        return num1/num2;
    }


}
