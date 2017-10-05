package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String query = "level22.lesson13.task01";
        String delimeter = ".";

        getTokens(query, delimeter);
    }

    public static String[] getTokens(String query, String delimiter) {


        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] array = new String[tokenizer.countTokens()];

        int i = 0;
        while (tokenizer.hasMoreElements()) {
            array[i] = tokenizer.nextToken();
            i++;
        }

        return array;
    }
}