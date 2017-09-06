package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {

        BufferedReader consol = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[20];

        for (int i = 0; i < numbers.length ; i++) {
            String c = consol.readLine();
            numbers [i] = Integer.parseInt(c);
        }// создай и заполни массив
        return numbers;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (array[i] > max)
                max = array[i];
        }

        // найди максимальное значение
        return max;
    }
}
