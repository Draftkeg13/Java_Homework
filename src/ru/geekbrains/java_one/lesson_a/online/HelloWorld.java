package ru.geekbrains.java_one.lesson_a.online;

public class HelloWorld {
    private static void primer() {  // Первое задание
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 2;
        System.out.println(a * (b + c / (d * 1f)));
    }
    public static void checkRange() { // Второе задание
        int first = 9;
        int second = 10;

        if ((first + second) >= 10 && (first + second) <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void whatNumber() { // Третье задание
        int check = 56;
        if (check < 0) {
            System.out.println("Вы ввели отрицательное число");
        }
        else {
            System.out.println("Вы ввели положительное число");
        }
    }
    public static void gritings(){ // Четвёртое задание
        String name = ("Victor");
        System.out.println("Приветствуем Вас, " + name);
    }
    public static void whatYear(){ // Пятое задание
        int year = 1;
        if ((year % 400) == 0){
            System.out.println("Вы ввели " + year + " год, он является високосным");
        }
        else if ((year % 100) == 0){
            System.out.println("Вы ввели " + year + " год, он не является високосным");
        }
        else if ((year % 4) == 0){
            System.out.println("Вы ввели " + year + " год, он является високосным");
        }
        else {
            System.out.println("Вы ввели " + year + " год, он не является високосным");
        }
    }
    public static void main(String[] args) {
        primer();
        checkRange();
        whatNumber();
        gritings();
        whatYear();
    }
}
