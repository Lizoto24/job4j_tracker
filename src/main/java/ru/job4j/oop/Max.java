package ru.job4j.oop;

public class Max {
    public static int number(int left, int right) {
        boolean maxNumber = left >= right;
        return maxNumber ? left : right;
    }

    public static int number(int left, int right, int third) {
        int temp = number(right, third);
        return number(left, temp);
    }
    public static int number(int left, int right, int third, int fourth) {
        int tempFour = number(right, third, left);
        return number(fourth, tempFour);
    }

    public static void main(String[] args) {
        System.out.println(Max.number(7,9));
        System.out.println(Max.number(23,17,0));
        System.out.println(Max.number(89,-6,9000, 24));

    }

}