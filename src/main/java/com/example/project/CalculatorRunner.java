package com.example.project;


public class CalculatorRunner {
    public static void main(String[] args) {


        //test your program here
        //1. create an instance of the calculator class
        Calculator calc1 = new Calculator("TI84");
        System.out.print(calc1.info());


        //2. call any methods of that class to test


        System.out.println(calc1.performOperation("+", 5, 6));
        System.out.println(calc1.performOperation("-", 5, 6));
        System.out.println(calc1.performOperation("/", 5, 6));
        System.out.println(calc1.performOperation("*", 5, 6));
        System.out.println(calc1.performOperation("G", 5, 6));


        System.out.println(calc1.divisibleBy(10, 5));
        System.out.println(calc1.divisibleBy(7, 4));


        System.out.println(calc1.coordinatePair(7, 8));


        System.out.println(calc1.absoluteValue(55, 100));




    }
}

