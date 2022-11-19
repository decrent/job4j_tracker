package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error critical = new Error(true, 120, "Критическая ошибка");
        Error low = new Error(false, 90, "Введите значение");
        low.printInfo();
    }

    public void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Код: " + status);
        System.out.println("Текст ошибки: " + message);
    }
}