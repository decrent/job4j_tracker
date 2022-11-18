package ru.job4j.oop;

public class JukeBox {
    public String music(int position) {
        return switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
    }

    public static void main(String[] args) {
        JukeBox song = new JukeBox();
        int position = 1;
        System.out.println(song.music(position));
        position = 2;
        System.out.println(song.music(position));
        position = 3;
        System.out.println(song.music(position));
    }
}
