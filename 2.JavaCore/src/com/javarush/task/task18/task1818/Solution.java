package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        String[] files = new String[3];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            files[i] = reader.readLine();
        }

        for (int i = 0; i < files.length; i++) {
            switch (i){
                case 0:
                    // создать поток для записи
                    break;
                case 1:
                    // создать поток для чтения
                    BufferedWriter writer = new BufferedWriter(new FileWriter(files[0]));
                    BufferedReader fileReader = new BufferedReader(new FileReader(files[1]));
                    StringBuilder sb = new StringBuilder();
                    while (fileReader.ready()) {
                        sb = sb.append(fileReader.readLine() + "\n");
                    }
                    writer.write(sb.toString());
                    writer.flush();
                    fileReader.close();
                    writer.close();
                    break;
                case 2:

                    writer = new BufferedWriter(new FileWriter(files[0], true));
                    fileReader = new BufferedReader(new FileReader(files[2]));

                    sb = new StringBuilder();
                    while (fileReader.ready()) {
                        sb = sb.append(fileReader.readLine() + "\n");
                    }
                    writer.append(sb);
                    writer.flush();
                    fileReader.close();
                    writer.close();
                    break;
            }
        }

        reader.close();
    }

}

