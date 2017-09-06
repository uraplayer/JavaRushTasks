package com.javarush.task.task14.task1405;

/* 
Food
*/

import com.sun.org.apache.xpath.internal.SourceTree;

public class Solution
{
    public static void main(String[] args)
    {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food)
    {
        food.onSelect(); //тут добавьте вызов методов для переменной food
        food.eat();
    }

    public static void selectableMethods(Selectable selectable)
    {

        selectable.onSelect();
        //метод eat недоступен, так как в интерфейсе прописан только onSelect
        //тут добавьте вызов методов для переменной selectable
    }

    interface Selectable
    {
        void onSelect();
    }

    static class Food implements Selectable
    {
        public void eat()
        {
            System.out.println("food is eaten");
        }

        @Override
        public void onSelect()
        {
            System.out.println("food is selected");
        }
    }
}

