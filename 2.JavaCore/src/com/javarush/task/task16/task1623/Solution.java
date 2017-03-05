package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

import javax.sound.midi.Soundbank;

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads = 1;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
        while (countCreatedThreads <= Solution.count) {
            System.out.println(new GenerateThread());
        }
    }

    public static class GenerateThread extends Thread {
        GenerateThread() {
            super(String.valueOf(countCreatedThreads++));
            run();
        }

        @Override
        public String toString() {
            return (getName() + " created");
        }
    }
}
