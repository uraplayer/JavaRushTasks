package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[10];

        for (int i = 0; i < array.length-2; i++) {
            array [i] = b.readLine();

        }

        for (int i = 1; i <= array.length; i++) {
            System.out.println(array[array.length - i]);
        }
        //напишите тут ваш код
    }
}