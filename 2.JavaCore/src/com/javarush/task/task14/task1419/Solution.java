package com.javarush.task.task14.task1419;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }

        try {
            throw new EOFException();
        } catch (EOFException e) {
            exceptions.add(e);
        }

        try {
            throw new SQLException();
        } catch (SQLException e) {
            exceptions.add(e);
        }

        try {
            throw new InterruptedIOException();
        } catch (InterruptedIOException e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException e) {
            exceptions.add(e);
        }

        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }





        //напишите тут ваш код

    }
}
