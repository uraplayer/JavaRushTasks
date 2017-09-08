package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadEndLess());
        threads.add(new ThreadException());
        threads.add(new ThreadUra());
        threads.add(new ThreadMessage());
        threads.add(new ThreadSout());
    }


    public static void main(String[] args) {


    }

    public static class ThreadEndLess extends Thread {
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadException extends Thread {
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadUra extends Thread {
        public void run() {

            try {
                while (!isInterrupted()) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class ThreadMessage extends Thread implements Message {
        public void run() {

        }

        @Override
        public void showWarning() {
            if (isAlive())
                interrupt();
        }
    }

    public static class ThreadSout extends Thread {
        public void run() {

            BufferedReader consolreader = new BufferedReader(new InputStreamReader(System.in));

            String s = null;
            int sum = 0;

            while (true) {


                try {
                    s = consolreader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (s.equals("N") == true)
                    break;
                {

                    sum = sum + Integer.parseInt(s);
                }
            }
            System.out.println(sum);
        }
    }
}