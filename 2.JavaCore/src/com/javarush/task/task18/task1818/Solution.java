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
            System.out.println(i+1);
        }

        for (int i = 0; i < files.length; i++) {
            switch (i){
                case 0:
                    // создать поток для записи
                    FileOutputStream fileOutputStream = new FileOutputStream(files[0]);
                    FileInputStream fileInputStream = new FileInputStream(files[1]);
                    while (fileInputStream.available() != 0) {
                        fileOutputStream.write(fileInputStream.read());
                    }
                    fileInputStream.close();
                    fileOutputStream.close();

                    break;
                case 1:
                    // создать поток для чтения
                    fileInputStream = new FileInputStream(files[2]);
                    fileOutputStream = new FileOutputStream(files[0], true);

                    while (fileInputStream.available() != 0) {
                        fileOutputStream.write(fileInputStream.read());

                    }
                    fileInputStream.close();
                    fileOutputStream.close();
                    break;
                case 2:


                    break;
            }
        }

        reader.close();
    }

}

