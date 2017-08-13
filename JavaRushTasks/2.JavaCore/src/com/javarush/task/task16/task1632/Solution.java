package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static class ThreadOne extends Thread {
        int i = 0;

        public void run() {
            while (true) {
                i++;
            }
        }
    }

    public static class ThreadTwo extends Thread {

        public void run() {
            try {
                this.join();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadThree extends Thread {

        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    this.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exceptions");
            }
        }
    }

    public static class ThreadFour extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        public void run() {

        }
    }

    public static class ThreadFive extends Thread {

        String str;
        int sumstr;

        public void run() {


            Scanner sc = new Scanner(System.in);
            while (!(str = sc.nextLine()).equals("N")) {
                sumstr += Integer.parseInt(str);
            }

            System.out.println(sumstr);

        }

    }

    static {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        ThreadThree threadThree = new ThreadThree();
        ThreadFour threadFour = new ThreadFour();
        ThreadFive threadFive = new ThreadFive();

        threads.add(threadOne);
        threads.add(threadTwo);
        threads.add(threadThree);
        threads.add(threadFour);
        threads.add(threadFive);

    }

    public static void main(String[] args) throws Exception {

    }
}