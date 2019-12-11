package ru.geekbrains.java_one.lesson_c.online;


import java.util.Random;
import java.util.Scanner;

public class TikTakToe {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;

    private static void initField() {
        fieldSizeY = 3;
        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
        System.out.println();

        for (int i = 0; i < fieldSizeX; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }

        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print("-");
        System.out.println();
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Р’РІРµРґРёС‚Рµ, РїРѕР¶Р°Р»СѓР№СЃС‚Р°, РєРѕРѕСЂРґРёРЅР°С‚С‹ X РѕС‚ 1 РґРѕ 3 Рё Y РѕС‚ 1 РґРѕ 3 С‡РµСЂРµР· РїСЂРѕР±РµР»");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean checkWinLine(char c) {

        for (int i = 0; i < 3; i++) {
            boolean colum = true;
            boolean row = true;
            for (int j = 0; j < 3; j++) {
                row &= (field[i][j] == c);
                colum &= (field[j][i] == c);
            }
            if (row || colum) return true;
        }
        return false;
    }
    private static boolean checkWinDiag(char c) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < 3; i++) {
            if (field[i][i] == c) left++;
            if (field[3 - i - 1][i] == c) right++;
            if (left == 3 || right == 3) return true;
        }
        return false;
    }

    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWinLine(DOT_HUMAN) || checkWinDiag(DOT_HUMAN)) {
                System.out.println("Human win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            printField();
            if (checkWinLine(DOT_AI) || checkWinDiag(DOT_AI)) {
                System.out.println("Computer win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
        }
    }

    /*
    1. РџРѕР»РЅРѕСЃС‚СЊСЋ СЂР°Р·РѕР±СЂР°С‚СЊСЃСЏ СЃ РєРѕРґРѕРј;
    2. РџРµСЂРµРґРµР»Р°С‚СЊ РїСЂРѕРІРµСЂРєСѓ РїРѕР±РµРґС‹, С‡С‚РѕР±С‹ РѕРЅР° РЅРµ Р±С‹Р»Р° СЂРµР°Р»РёР·РѕРІР°РЅР°
        РїСЂРѕСЃС‚Рѕ РЅР°Р±РѕСЂРѕРј СѓСЃР»РѕРІРёР№.
    3. * РџРѕРїСЂРѕР±РѕРІР°С‚СЊ РїРµСЂРµРїРёСЃР°С‚СЊ Р»РѕРіРёРєСѓ РїСЂРѕРІРµСЂРєРё РїРѕР±РµРґС‹,
        С‡С‚РѕР±С‹ РѕРЅР° СЂР°Р±РѕС‚Р°Р»Р° РґР»СЏ РїРѕР»СЏ 5С…5 Рё РєРѕР»РёС‡РµСЃС‚РІР° С„РёС€РµРє 4.
    4. *** Р”РѕСЂР°Р±РѕС‚Р°С‚СЊ РёСЃРєСѓСЃСЃС‚РІРµРЅРЅС‹Р№ РёРЅС‚РµР»Р»РµРєС‚, С‡С‚РѕР±С‹ РѕРЅ РјРѕРі
        Р±Р»РѕРєРёСЂРѕРІР°С‚СЊ С…РѕРґС‹ РёРіСЂРѕРєР°, Рё РїС‹С‚Р°С‚СЊСЃСЏ РІС‹РёРіСЂР°С‚СЊ СЃР°Рј.
    * */
}