package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Результат сложения: " + sum(10));
        System.out.println("Результат вычитания: " + minus(109));
        System.out.println("Результат умножения: " + calculator.multiply(3));
        System.out.println("Результат деления: " + calculator.divide(95));
        System.out.println("Результат суммирования результатов всех операций: " + calculator.sumAllOperation(25));
    }
}