package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
       return eng;
    }

    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String eng = bot.engToRus("trust");
        System.out.println("Неизвестное слово. " + eng);
    }
}
