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
        int rsl = sum(s) + minus(s) + devide(s) + multiply(s);
        return rsl;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiply(10);
        calc.devide(10);
        calc.sumAllOperation(10);
        sum(10);
        minus(10);
    }
}