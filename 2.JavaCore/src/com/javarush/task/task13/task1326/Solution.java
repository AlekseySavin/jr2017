package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        ArrayList<Integer> list = new ArrayList();
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            while (scanner.hasNext()) {
                list.add(Integer.parseInt(scanner.nextLine()));
            }
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        bufferedReader.close();

        Collections.sort(list);

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) % 2 ==0) {
                System.out.println(list.get(i));
            }
        }

    }
}
