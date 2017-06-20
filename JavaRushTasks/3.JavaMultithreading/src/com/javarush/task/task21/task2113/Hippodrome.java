package com.javarush.task.task21.task2113;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 20.06.2017.
 */
public class Hippodrome {
    private List<Horse> horses = new LinkedList<Horse>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    static Hippodrome game;

    void run() throws Exception {
        for (int i = 0; i < 100 ; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    void move() {
        for (Horse h: horses) {
            h.move();
        }
    }

    void print() {
        for (Horse h: horses) {
            h.print();
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double maxdist = 0;
        int ind = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (maxdist <= horses.get(i).getDistance()) {
                maxdist = horses.get(i).getDistance();
                ind = i;
            }
        }
        return getHorses().get(ind);

    }

    public void printWinner() {
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() +"!");
    }


    public static void main(String[] args) {

        List<Horse> horses = new LinkedList<>();

        Horse one = new Horse("One", 3, 0);
        Horse two = new Horse("Two", 3, 0);
        Horse three = new Horse("Three", 3, 0);

        horses.add(one);
        horses.add(two);
        horses.add(three);


        game = new Hippodrome(horses);

        try {
            game.run();
            game.printWinner();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
