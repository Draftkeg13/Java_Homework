package ru.geekbrains.java_one.lesson_a.online;

public class HelloWorld {
    private static void primer(int a, int b, int c, int d) {  // Первое задание
        System.out.println(a * (b + c / (d * 1f)));
    }
    public static void checkRange(int first, int second) { // Второе задание
        if ((first + second) >= 10 && (first + second) <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void whatNumber(int check) { // Третье задание
        if (check < 0) {
            System.out.println("Вы ввели отрицательное число");
        }
        else {
            System.out.println("Вы ввели положительное число");
        }
    }
    public static void gritings(String name){ // Четвёртое задание
        System.out.println("Приветствуем Вас, " + name);
    }
    public static void whatYear(int year){ // Пятое задание
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
        primer(3,8,7,8);
        checkRange(9, 12);
        whatNumber(55);
        gritings("Viktor");
        whatYear(56);
    }
}
