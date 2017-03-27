package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[3];

        ArrayList<String> listone = new ArrayList<>();
        ArrayList<String> listtwo = new ArrayList<>();
        ArrayList<String> listthree = new ArrayList<>();

        listone.add("List One Here");
        listtwo.add("List Two Here");
        listthree.add("List Three Here");

        arrayLists[0] = listone;
        arrayLists[1] = listtwo;
        arrayLists[2] = listthree;

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}