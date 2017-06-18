package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] — String, [значение] — double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в возрастающем порядке по имени.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<String, Double> map = new TreeMap<>();
        String fileName = args[0];
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        Double val = 0.0;

            while (br.ready()) {
                String[] str = br.readLine().split(" ");
                String lname = str[0];
                Double num = Double.parseDouble(str[1]);

                if (map.containsKey(str[0])) {
                    Object value = map.get(str[0]);
                    map.put(lname, Double.parseDouble(value.toString()) + num);
                }
                else {
                    map.put(lname, num);
                }
            }

            for (Map.Entry<String, Double> x : map.entrySet()) {
                System.out.println(x.getKey() + " " + x.getValue());
            }
        br.close();
    }
}
