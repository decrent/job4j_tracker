package ru.job4j.oop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {
    @Test
    public void whenX00Y04Z80Then8Dot94() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 4, 8);
        double expected = 8.94;
        double result = a.distance3d(b);
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void whenX05Y08Z99Then8Dot94() {
        Point a = new Point(0, 0, 9);
        Point b = new Point(5, 8, 9);
        double expected = 9.43;
        double result = a.distance3d(b);
        Assert.assertEquals(result, expected, 0.01);
    }
}