package ru.gorshckov.calc;

public class Calculator {
    public static void sum(double a,double b) {
        Double sum =  a + b;
        System.out.println(sum);
    }
    public static void sub(double a, double b){
        Double sub = a-b;
        System.out.println(sub);
    }
    public static void mult(double a, double b){
        Double mult = a*b;
        System.out.println(mult);
    }
    public static void div(double a, double b){
        Double div = a/b;
        System.out.println(div);
    }
    public static void percOfNumb (double a,double b){
        Double percOfNumber = (a*b)/100;
        System.out.println(a + "%, от числа "+ b + " равно "+percOfNumber);
    }
}
