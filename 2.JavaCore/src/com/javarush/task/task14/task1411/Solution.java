package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true)
        {
            key = reader.readLine();
            //создаем объект, пункт 2
            if (!((key.equals("user")) || (key.equals("loser")) || (key.equals("coder")) || (key.equals("proger")))) break; ;
            if (key.equals("user")) {
                Person.User user = new Person.User();
                person = user;
        }
            else if (key.equals("loser")) {
                Person.Loser loser = new Person.Loser();
                person = loser;
            }
            else if (key.equals("coder")) {
                Person.Coder coder = new Person.Coder();
                person = coder;
            }
            else if (key.equals("proger")) {
                Person.Proger proger = new Person.Proger();
                person = proger;
            }

            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        else if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        }
        else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
