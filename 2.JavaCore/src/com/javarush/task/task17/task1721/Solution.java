package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String fileone = br.readLine();
        String filetwo = br.readLine();
        BufferedReader fileReader1 = new BufferedReader(new FileReader(fileone));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(filetwo));

        Solution a = new Solution();

        while (fileReader1.ready()) {
            allLines.add(fileReader1.readLine());
        }

        while (fileReader2.ready()) {
            forRemoveLines.add(fileReader2.readLine());
        }

        a.joinData();
    }

    public void joinData () throws CorruptedDataException {
//      7. Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
//      8. Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            System.out.println("Contains All");
        }
        else {
            allLines.clear();
            System.out.println("Exception");
            throw new CorruptedDataException();
        }



    }
}
