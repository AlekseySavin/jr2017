package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Lobanov0", 499);
        map.put("Lobanov1", 501);
        map.put("Lobanov2", 501);
        map.put("Lobanov3", 501);
        map.put("Lobanov4", 501);
        map.put("Lobanov5", 501);
        map.put("Lobanov6", 501);
        map.put("Lobanov7", 501);
        map.put("Lobanov8", 501);
        map.put("Lobanov9", 501);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int)pair.getValue() < 500)
                iterator.remove();
        }

    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}