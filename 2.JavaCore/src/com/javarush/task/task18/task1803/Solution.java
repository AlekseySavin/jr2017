package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int byteReadTemp = fileInputStream.read();

        while (fileInputStream.available() > 0) {
            map.put(byteReadTemp, map.containsKey(byteReadTemp) ? map.get(byteReadTemp) + 1 : 1);
            byteReadTemp = fileInputStream.read();
        }

        fileInputStream.close();
        int maxcount = 0;
        int maxval = 0;
        ArrayList<Integer> maxcounts = new ArrayList<>();

        for (Map.Entry entry : map.entrySet()) {
            if (maxcount <= (int) entry.getValue()) {
                maxcounts.add((int) entry.getValue());
//                maxcount = (int) entry.getValue();
//                maxval = (int) entry.getKey();
            }
            //System.out.println("Byte: " + entry.getKey() + " Count: "+ entry.getValue());


        }

        int maxrem = maxcounts.get(0);

        for (int i = 0; i < maxcounts.size() ; i++) {

            if (maxcounts.get(i) > maxrem) {
                maxrem = maxcounts.get(i);
                maxcounts.remove(i);
            }
        }
    }
}
