package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //напишите тут ваш код
        String s = br.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //напишите тут ваш код
        String s = br.readLine();
        return Integer.parseInt(s);
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //напишите тут ваш код
        String s = br.readLine();
        return Double.parseDouble(s);
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //напишите тут ваш код
        String s = br.readLine();
        return Boolean.parseBoolean(s);
    }

    public static void main(String[] args) {

    }
}
