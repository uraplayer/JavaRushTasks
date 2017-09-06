package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

         HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Mama");
        hashSet.add("Mыла");
        hashSet.add("Раму");

        for (String x : hashSet) {

            System.out.println(x);

        }

    }
}
