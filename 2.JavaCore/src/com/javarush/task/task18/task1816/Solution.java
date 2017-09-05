package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String symbol = "";
        int counter = 0;

        while (bufferedReader.ready()) {
            char[] charVals = bufferedReader.readLine().toString().toCharArray();
            for (int i = 0; i < charVals.length ; i++) {
                    symbol = String.valueOf(charVals[i]);
                        if (symbol.matches("[a-zA-Z]")) {
                            counter++;
                        }
                 }
        }

        fileReader.close();
        bufferedReader.close();

        System.out.println(counter);
    }
}
