package ru.job4j.cast;

public class Bus implements Vehicle {
    private int count;

    @Override
    public void move () {
        System.out.println(getClass().getSimpleName() + " ездит по дорогам");
    }

    public void passengers(int count) {
        this.count = count;
        System.out.println("Колличество пассажиров  " + this.count);
    }
}
