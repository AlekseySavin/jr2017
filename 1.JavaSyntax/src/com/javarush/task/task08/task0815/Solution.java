package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Petro", "Petr");
        map.put("Sidorova", "Alexandra");
        map.put("Savinov", "Anton");
        map.put("Dzidzi", "Fedot");
        map.put("Petrov", "Fedor");
        map.put("Savinovskij", "Alex");
        map.put("Ivanov", "Petr");
        map.put("Sidorov", "Ignat");
        map.put("Osh", "Alex");
        map.put("Petrovo", "Petr");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry entry : map.entrySet()) {
            String mapname = entry.getValue().toString();
            if (name.equals(mapname)) {
                count++;
            }

        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry entry : map.entrySet()) {
            String mapname = entry.getKey().toString();
            if (lastName.equals(mapname)) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        System.out.println(getCountTheSameFirstName(map, "Alex"));
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey());
//            System.out.println("Val: "+ entry.getValue());
//        }

    }
}
