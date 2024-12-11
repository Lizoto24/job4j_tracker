package ru.job4j.oop;

public class Error {

    boolean active;
    int status;
    String message;

    public Error () {
    }

    public Error (boolean active,int status,String message) {
        this. active = active;
        this. status = status;
        this. message = message;
    }

    public void printInfo() {
        System.out.println("Много кэтов:   " + active);
        System.out.println("Колличество мисок для этих кэтов:  " + status);
        System.out.println("Порода этих кэтов:  " + message) ;
    }

    public static void main(String[] args) {
        Error cat = new Error ();
        cat.printInfo ();
        System.out.println("        ");

        Error barsik = new Error (true,78, "Мейн-кун");
        barsik.printInfo ();
        System.out.println("        ");

        Error persik = new Error (false, 4,"Персидские");
        persik.printInfo ();
    }
}
