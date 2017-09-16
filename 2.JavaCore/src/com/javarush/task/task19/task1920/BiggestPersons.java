package com.javarush.task.task19.task1920;

import java.util.HashMap;
import java.util.TreeMap;

public class BiggestPersons {

    private TreeMap<String, Double> map;

    public static String getBiggestPersons(TreeMap<String, Double> map) {

        String biggest_name = "";
        Double biggest_val = 0.0;

        TreeMap<Double, String> biggest_names = new TreeMap<>();

        for (HashMap.Entry entry : biggest_names.entrySet()) {
            String name = entry.getKey().toString();
            Double value = Double.parseDouble(entry.getValue().toString());

            if (value > biggest_val) {
                biggest_names.put(value, name);
            }
        }

        return biggest_name;
    }


    public void test() {
        System.out.println("TEST");
    }
}
