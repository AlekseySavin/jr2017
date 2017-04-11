package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики 2

Статики 2
1. В статическом блоке считайте две переменные с консоли А и В с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().


Требования:
1. Поле A должно быть статическим.
2. Поле B должно быть статическим.
3. Программа должна считывать данные с клавиатуры в статическом блоке.
4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
*/

public class Solution {
    public static int A = read();
    public static int B = read();

    public static final int MIN = min(A, B);

    public static int read() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(bufferedReader.readLine());
            return x;
        }
        catch (IOException e) {
            System.out.println(e);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
