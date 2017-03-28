package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(bf.readLine());

        int max = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > max) {
                max = data;
            }
        }

        System.out.println(max);

        inputStream.close();
    }
}
