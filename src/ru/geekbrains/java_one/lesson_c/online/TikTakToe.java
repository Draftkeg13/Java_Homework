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
    private static int winLine;

    private static void initField() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        winLine = 4;
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
            System.out.println("Введите координаты X и Y, через пробел, от 1 до 3, чтобы сделать ход");
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

        for (int i = 0; i < winLine; i++) {
            boolean colum = true;
            boolean row = true;
            for (int j = 0; j < winLine; j++) {
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

        for (int i = 0; i < winLine; i++) {
            if (field[i][i] == c) left++;
            if (field[winLine - i - 1][i] == c) right++;
            if (left == winLine || right == winLine) return true;
        }
        return false;
    }
    private static boolean checkWin (char c) {
        for (int i = 0; i < fieldSizeY - winLine -1; i++) {
            for (int j = 0; j < fieldSizeX - winLine -1; j++) {

                if (checkWinDiag(c) || checkWinLine(c)) return true;
            }
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
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Human win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Computer win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
        }
    }

}