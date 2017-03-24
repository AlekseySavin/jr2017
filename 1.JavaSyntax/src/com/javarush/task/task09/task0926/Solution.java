package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();

        int[] one = new int[5];
        int[] two = new int[2];
        int[] three = new int[4];
        int[] four = new int[7];
        int[] five = new int[0];

        for (int i = 0; i < one.length ; i++) {
            one[i] = i+100;
        }

        for (int i = 0; i < two.length ; i++) {
            two[i] = i+200;
        }

        for (int i = 0; i < three.length ; i++) {
            three[i] = i+300;
        }

        for (int i = 0; i < four.length ; i++) {
            four[i] = i+400;
        }

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);

        return list;
    }


    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
