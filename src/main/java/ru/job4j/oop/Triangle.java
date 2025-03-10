package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) +(pow(this.z - that.z, 2)));
    }
}

 public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return (ab < ac + bc && ac < ab + bc && bc < ac + ab);
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            result = Math.sqrt (p * (p - ab ) * ( p - ac) * ( p - bc));
        }
        return result;
    }

     public static void main(String[] args) {
      Point a = new Point(14,76,987);
      Point b = new Point(45,278,721);
      double distanceResult = a.distance3d(b);
      System.out.println(distanceResult);
      a.info();
      b.info();

     }
}

