package com.javaelementary;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    /*
    1. Создать 2-мерный массив (матрица) M*N и заполнить его случайными числами. Отсортировать числа по возрастанию,
    чтобы с левом верхнем углу было самое маленькое число, справа от него следующее по значению, итд, в правом нижнем
    углу самое большое.
    */

    public static final int M = 3;
    public static final int N = 5;

    public static void main(String[] args) {
        int[][] arr = new int[M][N];
        initArray(arr);
        printArray(arr);
        sortArray(arr);
    }

    private static void sortArray(int[][] arr) {
        int[] arr2 = new int[M * N];
        for (int i = 0; i < M; i++) {
            System.arraycopy(arr[i], 0, arr2, N * i, arr[i].length);
        }
        Arrays.sort(arr2);
        for (int i = 0; i < M; i++) {
            System.arraycopy(arr2, N * i, arr[i], 0, arr[i].length);
        }
        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void initArray(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(99);
            }
        }
    }
}