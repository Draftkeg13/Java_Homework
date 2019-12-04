package ru.geekbrains.java_one.lesson_a.online;

public class HelloWorld {
    private static void primer() {  // Первое задание
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 2;
        System.out.println(a * (b + c / (d * 1f)));
    }
    public static void checkrange() { // Второе задание
        int first = 9;
        int second = 10;

        if ((first + second) >= 10 && (first + second) <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        primer();
        checkrange();
    }
}
