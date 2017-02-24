package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();



    public static void main(String[] args) {

        labels.put(1.1, "ok0");
        labels.put(1.2, "ok1");
        labels.put(1.3, "ok2");
        labels.put(1.4, "ok3");
        labels.put(1.5, "ok4");

        System.out.println(labels);
    }
}
