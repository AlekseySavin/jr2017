package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws Exception {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String param;
        param = r.readLine().toString();
        Planet myp;

        if (param.equals(Planet.EARTH)) {
            myp = new Earth();
            thePlanet = myp;
        }
        else if (param.equals(Planet.MOON)) {
            myp = new Moon();
            thePlanet = myp;
        }
        else if (param.equals(Planet.SUN)) {
            myp = new Sun();
            thePlanet = myp;
        }
        else thePlanet = null;
    }

}
