package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());
        if (a <= 0) throw new Exception();

        int b = Integer.parseInt(br.readLine());
        if (b <= 0) throw new Exception();
        br.close();

        while (a != 0 && b != 0) {

            if (a >= b) {
                a = a % b;
            } else if (b > a) {
                b = b % a;
            }
        }

        System.out.println(a + b);

    }
}
