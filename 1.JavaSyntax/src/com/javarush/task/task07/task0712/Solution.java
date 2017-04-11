package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            list.add(bufferedReader.readLine());
        }

        int max = list.get(0).length();
        int min = list.get(0).length();

        for (int i = 0; i < list.size() ; i++) {

            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }

            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        for (String val : list ) {
            if (val.length() == max) {
                System.out.println(val);
                break;
            }
            if (val.length() == min) {
                System.out.println(val);
                break;
            }
        }
    }
}
