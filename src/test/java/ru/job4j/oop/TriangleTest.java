package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when90and40and1000ThenMinus1() {
        Point a = new Point(9, 0);
        Point b = new Point(4, 0);
        Point c = new Point(100, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when7169and27568Then44Dot7325() {
        Point a = new Point(7, 16, 9);
        Point b = new Point(27, 56, 8);
        double distanceResult = a.distance3d(b);
        double expected = 44.7325;
        assertThat(distanceResult).isCloseTo(expected, offset(0.001));
        System.out.println(distanceResult);
    }

    @Test
    public void when147698769and45278721Then() {
        Point a = new Point(14, 76, 987);
        Point b = new Point(45, 278, 721);
        double distanceResult = a.distance3d(b);
        double expected = 335.441;
        assertThat(distanceResult).isCloseTo(expected, offset(0.001));
        System.out.println(distanceResult);
    }

}