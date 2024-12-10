package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
     String say = "Неизвестное слово: " + eng;
     return say;
    }

    public static void main(String[] args) {
     DummyDic phrase = new DummyDic();
     String word = phrase.engToRus ("cat");
        System.out.println(word);
    }
}
