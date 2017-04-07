package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        int byteReadTemp = fileInputStream.read();

        while (fileInputStream.available() > 0) {
            byteReadTemp = fileInputStream.read();
            map.put(byteReadTemp, map.containsKey(byteReadTemp) ? map.get(byteReadTemp) + 1 : 1);
        }

        fileInputStream.close();


    }
}


