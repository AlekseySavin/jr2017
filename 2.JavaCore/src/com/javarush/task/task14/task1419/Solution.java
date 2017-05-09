package com.javarush.task.task14.task1419;

import java.io.*;
import java.text.Normalizer;
import java.util.*;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {

        initExceptions(); //+
        initException0(); //+
        initException3(); //+
        initException4(); //+
        initException5(null); //+
        initExeption6();
        initException7();
        initException9();
        initException10();
        initException11();


        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    private static void initException0() {
        try {
            FileReader fileReader = new FileReader("ok");
            fileReader.read();
        }
        catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        catch (IOException e) {
            exceptions.add(e);
        }
    }

    private static void initException3() { //third - NumberFormatException
        try {
            String x = "ok";
            int i = Integer.parseInt(x);
        }
        catch (Exception b) {
            exceptions.add(b);
        }
    }

    public static void initException4() { //four - IndexOutOfBoundsException
        try {
            List<Integer> list = new ArrayList();
            list.add(1);
            list.add(2);
            System.out.println(list.get(3));
        }
        catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
    }

    public static void initException5(Object object) { //fifth - NullPointerException
        try {
            object.toString();
        }
        catch (NullPointerException e) {
            exceptions.add(e);
        }
    }

    public static void initExeption6() { // six
        try {
            IllegalAccessException e = new IllegalAccessException();
            exceptions.add(e);
        }
        catch (IllegalFormatCodePointException e) {
            exceptions.add(e);
        }
    }

    public static void initException7() { // seven
        try {
            NoSuchElementException e = new NoSuchElementException();
            exceptions.add(e);
        }
        catch (NoSuchElementException e) {
            exceptions.add(e);
        }
    }

    public static void initException8() throws IllegalAccessException { //eight
        InstantiationException e = new InstantiationException();
        exceptions.add(e);
    }

    public static void initException9() {
        try {
            ClassCastException e = new ClassCastException();
            exceptions.add(e);
        }
        catch (ClassCastException e) {
            exceptions.add(e);
        }
    }

    public static void initException10() { //nine
        try {
            RuntimeException e = new RuntimeException();
            exceptions.add(e);
        }
        catch (RuntimeException e) {
            exceptions.add(e);
        }
    }
    public static void initException11() { //ten
        try {
            StringIndexOutOfBoundsException e = new StringIndexOutOfBoundsException();
            exceptions.add(e);
        }
        catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
    }
}
