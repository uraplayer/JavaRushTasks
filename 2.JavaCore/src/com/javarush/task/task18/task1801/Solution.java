package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consolReader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(consolReader.readLine());
        int max = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > max) {
                max = data;
                //System.out.println(max);
            }

        }
        consolReader.close();
        inputStream.close();
        System.out.println(max);
    }
}
