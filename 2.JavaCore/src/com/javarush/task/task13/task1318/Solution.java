package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fileName = br.readLine();

        InputStream inStream = new FileInputStream(fileName);
        while (inStream.available() > 0)
        {
            System.out.print((char)inStream.read()); //читаем один int из потока для чтения

        }
        inStream.close();
        br.close(); //закрываем потоки
    }
}