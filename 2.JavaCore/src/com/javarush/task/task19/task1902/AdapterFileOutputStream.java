package com.javarush.task.task19.task1902;

/* 
Адаптер
Используй класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.

Требования:
1. AmigoStringWriter должен быть интерфейсом.
2. Класс AdapterFileOutputStream должен реализовывать интерфейс AmigoStringWriter.
3. Класс AdapterFileOutputStream должен содержать приватное поле fileOutputStream типа FileOutputStream.
4. Класс AdapterFileOutputStream должен содержать конструктор с параметром FileOutputStream.
5. Метод flush() класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
6. Метод writeString(String s) класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
7. Метод close() класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    AdapterFileOutputStream(FileOutputStream fileOutputStream){
        this.fileOutputStream = fileOutputStream;
    }

    private FileOutputStream fileOutputStream;

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }

    @Override
    public void writeString(String s) throws IOException {
       fileOutputStream.write(s.getBytes());
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public static void main(String[] args) {

    }


}

