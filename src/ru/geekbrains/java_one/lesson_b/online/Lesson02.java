package ru.geekbrains.java_one.lesson_b.online;

import java.util.Arrays;

public class Lesson02 {

    public static void main(String[] args) {
        int[] switchArray = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int[] fillArray;
        fillArray= new int[8];
        int[] multArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrRewrite(switchArray);
        arrFiller(fillArray);
        arrMultiplicator(multArray);
    }
    private static void arrRewrite(int[] switchArray){ //Меняем 0 на 1 или 1 на 0
        System.out.print("Switched Array: ");
        for (int i = 0; i < switchArray.length; i++){
            switchArray[i] = (switchArray[i] == 1) ? 0 : 1;
            System.out.print(switchArray[i] + " ");
        }
    }
    private static void arrFiller(int[] fillArray){ //Заполняем массив
        int index = 1;
        System.out.print("\nFilled Array: ");
        for (int i = 0; i < fillArray.length; i++){
            fillArray[i] = index;
            index +=3;
            System.out.print(fillArray[i] + " ");
        }
     }
     private static void arrMultiplicator (int[] multArray){ //Умножаем числа меньше 6 на 2, в массиве
         System.out.print("\nMultiplied Array: ");
         for (int i = 0; i < multArray.length; i++){
             multArray[i] = (multArray[i] < 6) ? multArray[i] *= 2 : multArray[i];
             System.out.print(multArray[i] + " ");
         }
     }

}
