package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus (int z) {
        return z-x;
    }

    public int devide (int y) {
        return y/x;
    }

    public int sumAllOperation (int a) {
        return sum (a) +multiply(a) + minus (a) + devide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int resultMultiplyOperation = calculator.multiply(5);
        System.out.println(resultMultiplyOperation);
        int resultMinusOperation = minus (6);
        System.out.println(resultMinusOperation);
        int resultDevideOperation = calculator.devide(25);
        System.out.println(resultDevideOperation);
        int resultSumAllOperation = calculator.sumAllOperation (10);
        System.out.println(resultSumAllOperation);
    }

}


