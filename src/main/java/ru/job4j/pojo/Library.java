package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book comrades = new Book("Three comrades", 396);
        Book cleanCode = new Book("Clean code", 600);
        Book crime = new Book("Crime and punishment", 900);
        Book frankenstein = new Book("Frankenstein", 120);
        Book[] books = new Book[4];
        books[0] = comrades;
        books[1] = cleanCode;
        books[2] = crime;
        books[3] = frankenstein;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Replace 3 to 0");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }

        System.out.println("Shown only books.name Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals ("Clean code")) {
            System.out.println(book.getName());
        }
        }
    }
}
