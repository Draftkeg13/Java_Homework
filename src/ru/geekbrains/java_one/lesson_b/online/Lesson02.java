package ru.geekbrains.java_one.lesson_b.online;

import java.util.Arrays;

public class Lesson02 {

    public static void main(String[] args) {
        int[] switchArray = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int[] fillArray;
        fillArray = new int[8];
        int[] multArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] tableArray = new int[6][6];;
        int[] balanceArray = {10, 1, 1, 1, 5, 2};
        int[] changeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrRewrite(switchArray);
        arrFiller(fillArray);
        arrMultiplicator(multArray);
        arrMax(multArray);
        arrMin(multArray);
        arrTable(tableArray);
        arrFindBalance(balanceArray);
        arrSwitch(changeArray);

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
    private static boolean arrFindBalance (int[] balanceArray){
        boolean balance = false;
        int summLeft = 0;
        int index = balanceArray.length - 1;
        for (int i = 0; i < balanceArray.length - 1; i++) {
            int summRight = 0;
            summLeft = summLeft + balanceArray[i]; // Считаем сумму чисел слева на право
           System.out.print("Сумма слева " + summLeft + " "); // Вывод для проверки
            for (int j = balanceArray.length - 1; j > i; j-- ){
                summRight = summRight + balanceArray[j]; // Считаем сумму чисел справа на лево
               System.out.print("Сумма справа " + summRight + " "); // Вывод для проверки
                if (summLeft == summRight){
                    balance = true;
                }
            }
            System.out.println();

        }
        System.out.println(balance); // Вывод для проверки
            return balance;

        }
    private static void arrSwitch (int[] changeArray) {
        int switchKey = 1;
        int index = changeArray.length;
             for (int i = 0; i < changeArray.length; i++) {

             if ((i + switchKey) < changeArray.length){
                 changeArray[i + switchKey] = changeArray[i];
        }
             else {
                 changeArray[index - switchKey] = changeArray[i];
             }
             System.out.print(changeArray[i] +" ");
        }

    }
}
