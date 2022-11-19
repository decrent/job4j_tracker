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

    public int sumAllOperation() {
        int rsl = sum(10) + minus(10) + devide(10) + multiply(4);
        return rsl;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Calculator devide = new Calculator();
        Calculator multiply = new Calculator();
        System.out.println(sum(10));
        System.out.println(minus(10));
        System.out.println(calc.devide(10));
        System.out.println(calc.multiply(4));
        System.out.println(calc.sumAllOperation());
    }
}