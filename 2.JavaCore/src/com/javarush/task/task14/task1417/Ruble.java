package com.javarush.task.task14.task1417;

/**
 * Created by y.ezhov on 01.09.2017.
 */
public class Ruble extends Money {


    @Override
    public String getCurrencyName() {
        return "RUB";
    }

    Ruble (double d) {

        super(d);
    }
}