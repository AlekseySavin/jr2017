package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileone = bufferedReader.readLine();
            String filetwo = bufferedReader.readLine();

            BufferedReader readfile = new BufferedReader(new FileReader(fileone));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filetwo));

            while (readfile.ready()) {
                String str = readfile.readLine();
                String outstr = str.replaceAll("[^a-zA-Z ]", "");
                writer.write(outstr);
            }
            readfile.close();
            bufferedReader.close();
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
