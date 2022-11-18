package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
       return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String eng = bot.engToRus("trust");
        System.out.println(eng);
    }
}
