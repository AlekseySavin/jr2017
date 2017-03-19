package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        boolean sw = false;
        int len = 0;
        int sum = 0;
        float rez = 0;


        while (!sw) {
            int n = Integer.parseInt(r.readLine());

            if (n == -1) {
                rez = (float) sum / len;
                System.out.println(rez);
                sw = true;
                break;
            }
            len++;
            sum = sum + n;
        }
    }
}

