package com.javarush.task.task14.task1420;

/* 
НОД

Наибольший общий делитель (НОД) двух данных чисел a и b — это наибольшее число, на которое оба числа a и b делятся без остатка.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            int x = Integer.parseInt(bufferedReader.readLine());
            int y = Integer.parseInt(bufferedReader.readLine());

            if (x <= 0 || y <=0) throw new Exception();

            int nod = 0;

            for (int i = 1; i <=x ; i++) {
                if (x % i == 0 && y % i ==0) {
                    nod = i;
                }
            }
            System.out.println(nod);
        }
    }
