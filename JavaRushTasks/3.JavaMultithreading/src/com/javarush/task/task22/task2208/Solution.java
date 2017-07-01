package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();

        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        params.put("name", "Ivanov");

        System.out.println(getQuery(params));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder out = new StringBuilder();

        for (Map.Entry value: params.entrySet()) {
            if (value.getValue() == null) {
                continue;
            }
            else {
                if (out.length() > 0) {
                    out.append(" and ");
                }
                out.append(value.getKey().toString() + " = '" + value.getValue().toString() + "'");
            }
        }

        return out.toString();
    }
}
