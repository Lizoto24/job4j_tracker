package ru.job4j.polymorphism;

public class Bus implements Transport {
    private int count;
    private int fuel;

    @Override
   public void move () {
        System.out.println("Автомобиль двигается");
    }

    @Override
    public void passengers(int count) {
        this.count = count;
        System.out.println("Колличество пассажиров  " + this.count);
    }

    @Override
    public int refuel(int fuel) {
        this.fuel = fuel;
        int cost = this.fuel * 100;
        System.out.println("Стоимость заправки  " + cost);
        return cost;
    }

   }

   class Information {
       public static void main(String[] args) {
           Transport car = new Bus();
           car.move();
           car.passengers(7);
           car.refuel(50);
       }
   }


