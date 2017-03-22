package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader rea = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            list.add(Integer.parseInt(rea.readLine()));
        }

        for (int i = 0; i < list.size() ; i++) {
            int lentwo = list.get(i + 1).toString().length();
            int lenone = list.get(i).toString().length();
            System.out.println(lenone + " and " + lentwo);
            if ( lenone < lentwo)
                continue;
            else {
                System.out.println(i);
                break;
            }

        }
    }
}

