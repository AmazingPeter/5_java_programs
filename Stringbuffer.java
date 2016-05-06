package com.company;

/*
 Задача:
 Построить палиндром(текст наоборот) Dot saw I was Tod
 */
public class Stringbuffer {
    public Stringbuffer() {
    }

    static void GetResult() {
        StringBuffer s = new StringBuffer("Dot saw I was Tod");
        s.reverse().toString();
        System.out.println(s);
    }
}
