package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] houses;
        houses = new int[15];
        int even = 0; //четные
        int odd = 0; //нечетные

        for (int i = 0; i < houses.length ; i++) {
            houses[i] = Integer.parseInt(r.readLine());
        }

        for (int i = 0; i < houses.length ; i++) {
            if (i % 2 == 0 || i == 0) {
                even += houses[i];
            }
            else {
                odd += houses[i];
            }
        }

        System.out.println(even > odd ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");
    }
}
