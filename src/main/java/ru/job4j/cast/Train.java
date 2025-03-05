package ru.job4j.cast;

public class Train implements Vehicle {
    private int count;

    @Override
    public void move () {
        System.out.println(getClass().getSimpleName() + " ездит по рельсам");
    }

    public void passengers(int count) {
        this.count = count;
        System.out.println("Колличество пассажиров  " + this.count);
    }
}
