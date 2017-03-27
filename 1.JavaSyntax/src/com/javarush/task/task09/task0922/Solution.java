package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Date d = new Date(r.readLine());

        SimpleDateFormat format = new SimpleDateFormat("MMM d, YYYY");
        System.out.println(format.format(d).toUpperCase());
    }
}
