package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/*
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName = reader.readLine();
        ArrayList<String> list = new ArrayList<String>();

        Writer writer = null;


        writer = new BufferedWriter(new FileWriter(FileName));
        String data = "";
        do {
            data = reader.readLine();
            writer.write(data);
            writer.write(System.getProperty("line.separator"));
        }
        while (!data.equals("exit"));


        reader.close();
        writer.close();
    }
}
