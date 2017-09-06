package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = br.readLine();
            if (s.equals(Planet.SUN)) {
                Solution.thePlanet = Sun.getInstance();
            } else if (s.equals(Planet.MOON)) {
                Solution.thePlanet = Moon.getInstance();
            } else if (s.equals(Planet.EARTH)) {
                Solution.thePlanet = Earth.getInstance();
            } else Solution.thePlanet = null;
        } catch (
                IOException e)

        {
        }


        // implement step #5 here - реализуйте задание №5 тут
    }
}
