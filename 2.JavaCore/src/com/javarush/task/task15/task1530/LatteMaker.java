package com.javarush.task.task15.task1530;

/**
 * Created by xsd on 18.04.2017 with love.
 * :)
 *
 * @author xsd
 * @author alekseysavin.com
 * @version 0.1
 *
 */
public class LatteMaker extends DrinkMaker {
    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }
}
