package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String afile = bufferedReader.readLine();
        String bfile = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(afile);
        FileOutputStream outputStream = new FileOutputStream(bfile);

        byte[] buff = new byte[inputStream.available()];
                for (int i = inputStream.read(buff)-1; i >=0; i--) {
                    outputStream.write(buff[i]);
                }

        inputStream.close();
        outputStream.close();
    }
}
