package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = (SimpleObject) new StringObject<>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject<Object> implements SimpleObject {
        interface SimpleObject {
            String srt (String x);
        }

        @Override
        public Solution.SimpleObject getInstance() {
            return null;
        }
    }

}
