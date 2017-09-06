package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader filereader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME),
                    "UTF-8"));

            while (filereader.ready()) {
                String s = filereader.readLine();
                lines.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" not found!");
        } catch (IOException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" can't read!");
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
