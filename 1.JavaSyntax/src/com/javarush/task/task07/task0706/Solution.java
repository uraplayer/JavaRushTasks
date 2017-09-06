package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {

       int [] numbers = new int[15];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(br.readLine());
        }

        int sumEven= 0 , sumOdd = 0;

        for (int i = 0; i < numbers.length; i = i +2) {
            sumEven = sumEven + numbers[i];
        }

        for (int i = 1; i < numbers.length; i = i +2) {
            sumOdd = sumOdd + numbers[i];
        }


        if (sumEven < sumOdd)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");

        //напишите тут ваш код
    }
}
