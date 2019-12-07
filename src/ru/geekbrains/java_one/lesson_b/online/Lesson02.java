package ru.geekbrains.java_one.lesson_b.online;

import java.util.Arrays;

public class Lesson02 {
    private static void arrRewrite(int[] switchArray){ //Меняем 0 на 1 или 1 на 0
        System.out.print("Switched Array: ");
    for (int i = 0; i < switchArray.length; i++){
        switchArray[i] = (switchArray[i] == 1) ? 0 : 1;
        System.out.print(switchArray[i] + " ");
    }
}
    public static void main(String[] args) {
        int[] switchArray = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        arrRewrite(switchArray);
    }
}
