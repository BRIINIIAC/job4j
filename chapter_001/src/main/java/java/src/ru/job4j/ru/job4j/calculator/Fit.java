package ru.job4j.ru.job4j.calculator;

public class Fit {

    public static void main(String[] args) {

        double Man = ManWeigth(180);
        double Woman = WomanWeigth(175);
        System.out.println("Normal weight for man is " + Man);
        System.out.println("Normal weight for Woman is " + Woman);


    }

    public static double ManWeigth(double height){
        return (height - 100) * 1.15;
    }

    public static double WomanWeigth(double height){
        return (height - 110) * 1.15;
    }

}
