package com.javarush.task.task15.task1530;

/**
 * Created by xsd on 18.04.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 */
abstract public class DrinkMaker {

    abstract void putIngredient();
    abstract void pour();
    abstract void getRightCup();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}

