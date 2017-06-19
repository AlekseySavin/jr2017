package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ‘,‘, количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ‘,‘.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должно выводится число запятых в считанном файле.
4. Поток чтения из файла должен быть закрыт.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fname = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fname);
        int count = 0;

        while (fileInputStream.available() > 0) {
            int x = fileInputStream.read();
            if (x == 054) {
                count++;
                //System.out.println((char) x);
            }
        }
        System.out.println(count);
        fileInputStream.close();
        bufferedReader.close();
    }
}
