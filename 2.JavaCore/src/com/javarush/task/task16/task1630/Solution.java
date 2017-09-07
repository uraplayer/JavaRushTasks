package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.FileHandler;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader consolReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = consolReader.readLine();
            secondFileName = consolReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join(); //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private ArrayList<String> list;

        public ReadFileThread() {
            //this.fullFileName = null;
            this.list = new ArrayList<>();
        }


        public void run() {
            try (
                    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName)))) {
                while (br.ready()) {
                    list.add(br.readLine());
                }

                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        public void setFileName(String fullFileName) {

            this.fullFileName = fullFileName;

        }

        public String getFileContent() {

            StringBuffer sb = new StringBuffer();

            for (String s : list) {
                sb.append(s).append(" ");

            }

            return sb.toString();
        }

    }    //add your code here - добавьте код тут
}
