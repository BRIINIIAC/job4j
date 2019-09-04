package ru.job4j.ru.job4j.converter;

public class Converter {

    public static void main(String[] args) {
        int ru = ConRu(500);
        int eu = ConEu(430);
        int conDo = ReversEu(9);
        int conEu = ReversRu(7);
        System.out.println("500 rubles is " + ru + " dollar");
        System.out.println("430 rubles is " + eu + " euro");
        System.out.println("");
        System.out.println("9 dollars is " + conDo + " rubles");
        System.out.println("7 euro is " + conEu + " rubles");
        System.out.println("");

        int in = 500; //Входные параметры
        int ex = 8;  // перемена с ожидаемым результатом
        int out = ConRu(in); // перемена с вычеслением значение кода
        Boolean isTrue = ex == out; //  записываем сравнение двух переменных ожидаемое значение и вычисленное
        System.out.println("500 rubles is 8 Dollars : Test results - " + isTrue);

        int in2 = 430;
        int ex2 = 6;
        int out2 = ConEu(in2);
        boolean isTrue2 = ex2 == out2;
        System.out.println("420 rubles is 6 Euro : Test results - " + isTrue2);

        int in3 = 9;
        int ex3 = 630;
        int out3 = ReversEu(in3);
        boolean isTrue3 = ex3 == out3;
        System.out.println("9 rubles is 630 Dollars : Test results - " + isTrue3);

        int in4 = 7;
        int ex4 = 420;
        int out4 = ReversRu(in4);
        boolean isTrue4 = ex4 == out4;
        System.out.println("7 rubles is 420 Euro : Test results - " + isTrue4);



    }

    public static int ConRu(int value){
        return value / 60;
    }

    public static int ConEu(int value){
        return value / 70;
    }

    public static int ReversRu(int value){
        return value * 60;
    }

    public static int ReversEu(int value){
        return value * 70;
    }

}
