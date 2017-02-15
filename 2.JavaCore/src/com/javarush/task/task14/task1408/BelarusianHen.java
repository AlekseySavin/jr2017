package com.javarush.task.task14.task1408;

/**
 * Created by User on 15.02.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 11;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;    }
}
