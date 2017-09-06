package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        OutputStream outStream = new FileOutputStream(fileName);
        ArrayList<String> arrayList = new ArrayList<>();


        while (true)
        {
            String line = br.readLine();
            arrayList.add(line +"\r\n");
            if (line.equals("exit"))
            {
                for (String list : arrayList)
                {
                    outStream.write(list.getBytes());
                }

                break;

            }
        }


        outStream.close();
        br.close();

    }
}