package com.javarush.task.task01.task0140;

import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        int a;
        //напишите тут ваш код
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        a = sc.nextInt();

        System.out.println(a * a);
    }
}