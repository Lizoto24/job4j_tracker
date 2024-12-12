package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else {
            System.out.println("Колобок сбежал");
        }
    }
}

     class Hare {
        public void tryEat(Ball ball) {
        ball.tryRun(false);
        }
     }

    class Fox {
        public void tryEat(Ball ball){
            ball.tryRun(true);
        }

    }

    class Wolf {
        public void tryEat(Ball ball) {
            ball.tryRun(false);
        }

    }

    class BallStory {
        public static void main(String[] args) {
            Ball kolobok = new Ball ();
            Hare zayts = new Hare ();
            zayts.tryEat(kolobok);
            Fox lisichka = new Fox ();
            lisichka.tryEat (kolobok);
            Wolf volk = new Wolf ();
            volk.tryEat(kolobok);
        }
    }
