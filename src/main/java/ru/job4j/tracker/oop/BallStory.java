package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Ball ball = new Ball();
        fox.tryEat(ball);
        wolf.tryEat(ball);
        hare.tryEat(ball);
    }
}
