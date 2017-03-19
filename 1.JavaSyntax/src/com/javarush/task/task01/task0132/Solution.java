package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String x = String.valueOf(number);
        char[] list = x.toCharArray();
        int summa = 0;

        for (int i = 0; i < list.length; i++) {
            summa = summa + Integer.parseInt(String.valueOf(list[i]));
        }
        return summa;
    }
}