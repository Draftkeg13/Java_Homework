package ru.geekbrains.java_one.lesson_e.online;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sharik");
        Cat c = new Cat("Barsik");
        Bird b = new Bird("Chizhik");
        Horse h = new Horse("Plotva");
        Animal[] zoo = {d1, c, b, h};
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].runDistance(600);
            zoo[i].swimDistance(10);
            zoo[i].jumpBarrier(2);
        }
    }
}
