package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        // ded one
        Human dedone = new Human();
        Human dedtwo = new Human();
        Human babone = new Human();
        Human babtwo = new Human();
        Human mother = new Human();
        Human father = new Human();
        Human dimka = new Human();
        Human anton = new Human();
        Human aleks = new Human();

        dedone.name = "Valya";
        dedone.sex = true;
        dedone.age = 80;
        dedone.children.add(0, father);

        babone.name = "Vera";
        babone.sex = false;
        babone.age = 80;
        babone.children.add(0, father);


        dedtwo.name = "noname";
        dedtwo.sex = true;
        dedtwo.age = 80;
        dedtwo.children.add(0, mother);

        babtwo.name = "Varya";
        babtwo.sex = false;
        babtwo.age = 80;
        babtwo.children.add(0, mother);

        father.name = "Valera";
        father.sex = true;
        father.age = 60;
        father.children.add(0, dimka);
        father.children.add(1, anton);
        father.children.add(2, aleks);

        mother.name = "Lubov";
        mother.sex = false;
        mother.age = 60;
        mother.children.add(0, dimka);
        mother.children.add(1, anton);
        mother.children.add(2, aleks);

        dimka.name = "Dimka";
        dimka.sex = true;
        dimka.age = 35;

        anton.name = "Anton";
        anton.sex = true;
        anton.age = 30;

        aleks.name = "Aleks";
        aleks.sex = true;
        aleks.age = 28;

        System.out.println(dedone);
        System.out.println(babone);

        System.out.println(dedtwo);
        System.out.println(babtwo);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(dimka);
        System.out.println(anton);
        System.out.println(aleks);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
