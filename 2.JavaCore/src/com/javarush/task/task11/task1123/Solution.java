package com.javarush.task.task11.task1123;
/*
Задача по алгоритмам
Написать метод, который возвращает минимальное и максимальное числа в массиве.


Требования:
1. Программа не должна считывать данные с клавиатуры. +
2. Допиши реализацию метода getMinimumAndMaximum, он должен возвращать пару из минимума и максимума.
3. Метод main не изменять.
4. Программа должна вывести правильный результат.
5. Метод main должен вызывать метод getMinimumAndMaximum.

 */
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //Напишите тут ваше решение
        if (!(array == null)) {
            int tmax = array[0];
            int tmin = array[0];

            for (int i = 0; i < array.length ; i++) {
                if (array[i] > tmax) {
                    tmax = array[i];
                }
                if (array[i] < tmin) {
                    tmin = array[i];
                }
            }
            return new Pair<>(tmin, tmax);
        }

        return new Pair<Integer, Integer>(0, 0);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
