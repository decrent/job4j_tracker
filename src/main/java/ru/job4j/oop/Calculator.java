package ru.job4j.oop;

import javax.sound.midi.Soundbank;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int devide(int d) {
        return d / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + devide(s) + multiply(s);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Результат умножения " + calc.multiply(10));
        System.out.println("Результат деления " + calc.devide(10));
        System.out.println("Результат сложения  " + sum(10));
        System.out.println("Разница " + minus(10));
        System.out.println("Сумма всех операций " + calc.sumAllOperation(10));
    }
}