package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;
import com.javarush.task.task19.task1920.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        String file = args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String FileLine = "";

        TreeMap<String, Double> stringHashMap = new TreeMap<String, Double>();

        while (bufferedReader.ready()) {
            FileLine = bufferedReader.readLine();
            String data[] = FileLine.split(" ");
            String name = data[0];
            String val = data[1];

            if (stringHashMap.containsKey(name)) {
                stringHashMap.put(name, stringHashMap.get(name) + Double.parseDouble(val));
            } else {
                stringHashMap.put(name, Double.parseDouble(val));
            }
        }

        System.out.println(BiggestPersons.getBiggestPersons(stringHashMap));

        bufferedReader.close();

    }

}
