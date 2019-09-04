package ru.job4j;

public class Calculator {



    public static void main(String[] args) {
        div(10,2);
        multiple(3,5);
        subtrack(20,10);



    }

    public static void div(int first, int second){
        int resulst = first / second;
        System.out.println(first + " / " + second + " = " + resulst);
    }

    public static void multiple(int first, int second){
        int resulst = first * second;
        System.out.println(first + " * " + second + " = " + resulst);
    }

    public static void subtrack(int first, int second){
        int resulst = first - second;
        System.out.println(first + " - " + second + " = " + resulst);
    }



}
