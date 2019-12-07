package ru.geekbrains.java_one.lesson_b.online;

import java.util.Arrays;

public class Lesson02 {

    public static void main(String[] args) {
        int[] switchArray = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int[] fillArray;
        fillArray = new int[8];
        int[] multArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] tableArray = new int[6][6];;
        arrRewrite(switchArray);
        arrFiller(fillArray);
        arrMultiplicator(multArray);
        arrMax(multArray);
        arrMin(multArray);
        arrTable(tableArray);
    }
    private static void arrRewrite(int[] switchArray){ //Меняем 0 на 1 или 1 на 0
        System.out.print("Switched Array: ");
        for (int i = 0; i < switchArray.length; i++){
            switchArray[i] = (switchArray[i] == 1) ? 0 : 1;
            System.out.print(switchArray[i] + " ");
        }
        System.out.println();
    }
    private static void arrFiller(int[] fillArray){ //Заполняем массив
        int index = 1;
        System.out.print("Filled Array: ");
        for (int i = 0; i < fillArray.length; i++){
            fillArray[i] = index;
            index +=3;
            System.out.print(fillArray[i] + " ");
        }
        System.out.println();
     }
     private static void arrMultiplicator (int[] multArray){ //Умножаем числа меньше 6 на 2, в массиве
         System.out.print("Multiplied Array: ");
         for (int i = 0; i < multArray.length; i++){
             multArray[i] = (multArray[i] < 6) ? multArray[i] *= 2 : multArray[i];
             System.out.print(multArray[i] + " ");
         }
         System.out.println();
     }
    private static void arrMax (int[] multArray){ // Поиск максимального значения в массиве
        int max = multArray[0];
        for (int i = 0; i < multArray.length; i++){
            //max = Math.max(multArray[i], max);
            max = (multArray[i] < max) ? max : multArray[i];
        }
        System.out.print("Max number in array " + max);
        System.out.println();
    }
    private static void arrMin (int[] multArray){ // Поиск минимального значения в массиве
        int min = multArray[0];
        for (int i = 0; i < multArray.length; i++){
            //min = Math.min(multArray[i], min);
            min = (multArray[i] > min) ? min : multArray[i];
        }
        System.out.print("Min number in array " + min);
        System.out.println();
    }
    private static void arrTable (int[][] tableArray){ //в двумерном массиве ставим 1 по диагонали
        System.out.println("Table Array: ");
        int index = tableArray.length - 1;
        for (int i = 0; i < tableArray.length; i++){
            for (int j = 0; j < tableArray[i].length; j++){
                if (i == j ||(index - i) == j) {
                    tableArray[i][j] = 1;
                }
               // else {
                 //   tableArray[i][j] = 0;
                //}
                System.out.print(tableArray[i][j] + " ");
                }
            System.out.println();
            }
        }


}
