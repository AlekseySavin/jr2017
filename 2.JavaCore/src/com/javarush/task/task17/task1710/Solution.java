package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String name = "";
        String sex = "" ;
        Date date = null;

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        SimpleDateFormat outform = new SimpleDateFormat("DD-MMM-yyyy", Locale.ENGLISH);

        if (args[0].equals("-c")) {
            name = args[1];
            sex = args[2];
            date = format.parse(args[3]);
            System.out.println(date);

            //parse sex
            if (args[2].equals("м")) {
                sex = Sex.MALE.toString();
                allPeople.add(Person.createMale(name, date));
            }

            if (args[2].equals("ж")) {
                sex = Sex.FEMALE.toString();
                allPeople.add(Person.createFemale(name, date));
            }

            for (int i = 0; i < allPeople.size() ; i++) {
                if (name.equals(allPeople.get(i).getName())) {
                    System.out.println(i);
                }
            }
        }

        else if (args[0].equals("-u")) {
            int index = Integer.parseInt(args[1]);

            name = args[2];
            sex = args[3];
            date = format.parse(args[4]);

            allPeople.get(index).setName(name);
            //parse sex
            if (args[3].equals("м")) {
                allPeople.get(index).setSex(Sex.MALE);
            }
            if (args[3].equals("ж")) {
                allPeople.get(index).setSex(Sex.FEMALE);
            }
            allPeople.get(index).setBirthDay(date);
        }

        else if (args[0].equals("-d")) {
            int index = Integer.parseInt(args[1]);

            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setBirthDay(null);

        }

        else if (args[0].equals("-i")) {
            int index = Integer.parseInt(args[1]);

            name = allPeople.get(index).getName();

            if (allPeople.get(index).getSex().equals(Sex.MALE)) {
                sex = "м";
            }

            if (allPeople.get(index).getSex().equals(Sex.FEMALE)) {
                sex = "ж";
            }
            System.out.println(name + " " + sex + " " + outform.format(allPeople.get(index).getBirthDay()));
        }

    }
}
