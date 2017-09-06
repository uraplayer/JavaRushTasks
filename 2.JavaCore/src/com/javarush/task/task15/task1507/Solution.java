package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static String printMatrix (String s)
    {
     return s;
    }


    public static int printMatrix (int s)
    {
        return s;
    }


    public static Integer printMatrix (Integer s)
    {
        return s;
    }


    public static double printMatrix (double s)
    {
        return s;
    }


    public static char printMatrix (char s)
    {
        return s;
    }


    public static long printMatrix (long s)
    {
        return s;
    }


    public static Long printMatrix (Long s)
    {
        return s;
    }


    public static byte printMatrix (byte s)
    {
        return s;
    }




}
