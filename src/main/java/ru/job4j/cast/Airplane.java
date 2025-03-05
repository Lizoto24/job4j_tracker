package ru.job4j.cast;

public class Airplane implements Vehicle{
   private int count;

   @Override
   public void move () {
       System.out.println(getClass().getSimpleName() + " летает по воздуху");
   }

   public void passengers (int count) {
       this.count = count;
       System.out.println("Колличество пассажиров  " + this.count);
   }


}
